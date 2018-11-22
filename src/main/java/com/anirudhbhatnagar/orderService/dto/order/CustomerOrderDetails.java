package com.anirudhbhatnagar.orderService.dto.order;

import com.anirudhbhatnagar.orderService.dto.customer.Customer;
import com.anirudhbhatnagar.orderService.dto.product.Item;

import java.time.LocalDateTime;
import java.util.List;

public class CustomerOrderDetails {

    private String orderId;
    private String externalReference;
    private Customer customer;
    private LocalDateTime createdDate;
    private List<Item> items;
}
