package com.anirudhbhatnagar.orderService.dto.request;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class CustomerOrderRequest {

    private String customerId;
    private String externalReference;
    private LocalDateTime createdDate;
    private List<Item> items;
}
