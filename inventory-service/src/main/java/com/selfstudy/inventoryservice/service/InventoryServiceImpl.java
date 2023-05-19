package com.selfstudy.inventoryservice.service;

import com.selfstudy.inventoryservice.dto.InventoryResponse;
import com.selfstudy.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @SneakyThrows
    @Override
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        log.info("Checking Inventory");
//        log.info("thread starts");
//        Thread.sleep(10000);
//        log.info("thread ends");
        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
                .map(inventory ->
                        InventoryResponse.builder()
                                .skuCode(inventory.getSkuCode())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()
                ).toList();
    }

}
