package com.anirudhbhatnagar.orderService.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@Getter
@ToString
public class Item {
    private Product product;
    private BigDecimal quantity;

}
