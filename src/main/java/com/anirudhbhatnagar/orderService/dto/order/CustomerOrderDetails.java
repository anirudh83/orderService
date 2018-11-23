package com.anirudhbhatnagar.orderService.dto.order;

import com.anirudhbhatnagar.orderService.dto.customer.Customer;
import com.anirudhbhatnagar.orderService.dto.product.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@ToString
public class CustomerOrderDetails {

    private Long orderId;
    private String externalReference;
    private Customer customer;
    private LocalDateTime createdDate;
    private List<Item> items;
    private BigDecimal totalOrderCost;
    private BigDecimal totalOrderTax;
}
