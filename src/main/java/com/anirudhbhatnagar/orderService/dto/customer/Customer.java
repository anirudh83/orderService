package com.anirudhbhatnagar.orderService.dto.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;
}
