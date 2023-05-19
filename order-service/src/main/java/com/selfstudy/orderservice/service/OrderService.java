package com.selfstudy.orderservice.service;

import com.selfstudy.orderservice.dto.OrderRequest;

public interface OrderService {

    public String placeOrder(OrderRequest orderRequest);
}
