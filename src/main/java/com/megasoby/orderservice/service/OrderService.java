package com.megasoby.orderservice.service;

import com.megasoby.orderservice.dto.OrderDto;
import com.megasoby.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
