package com.selfstudy.inventoryservice.service;

import com.selfstudy.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    public List<InventoryResponse> isInStock(List<String> skuCode);

}
