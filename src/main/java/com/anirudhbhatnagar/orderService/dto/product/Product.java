package com.anirudhbhatnagar.orderService.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Product {
    private String id;
    private String name;
    private String description;
    private String price;
    private String sku;
}
