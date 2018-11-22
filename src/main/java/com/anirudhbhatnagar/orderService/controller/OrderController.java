package com.anirudhbhatnagar.orderService.controller;

import com.anirudhbhatnagar.orderService.domain.Item;
import com.anirudhbhatnagar.orderService.domain.Order;
import com.anirudhbhatnagar.orderService.dto.order.CustomerOrderDetails;
import com.anirudhbhatnagar.orderService.dto.request.CustomerOrderRequest;
import com.anirudhbhatnagar.orderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {

    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public List<CustomerOrderDetails> getCustomerOrders(@RequestParam String customerId) {
        final List<Order> order = orderRepository.findByCustomerId(customerId);
        return null;
    }

    @GetMapping("/orders/{id}")
    public Order getOrders(@PathVariable("id") Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @PostMapping("/orders")
    public Order save(@RequestBody CustomerOrderRequest request) {
        return orderRepository.save(Order
                .builder()
                .customerId(request.getCustomerId())
                .externalReference(request.getExternalReference())
                .items(toItems(request.getItems())).build());
    }

    private List<Item> toItems(List<com.anirudhbhatnagar.orderService.dto.request.Item> items) {
        return items.stream().map(item -> Item.builder().productId(item.getProductId())
                .quantity(item.getQuantity()).build()).collect(Collectors.toList());
    }
}

