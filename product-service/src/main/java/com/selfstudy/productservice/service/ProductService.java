package com.selfstudy.productservice.service;

import com.selfstudy.productservice.dto.ProductRequest;
import com.selfstudy.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();

}
