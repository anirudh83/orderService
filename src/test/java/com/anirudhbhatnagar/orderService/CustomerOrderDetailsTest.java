package com.anirudhbhatnagar.orderService;

import com.anirudhbhatnagar.orderService.dto.customer.Address;
import com.anirudhbhatnagar.orderService.dto.customer.Customer;
import com.anirudhbhatnagar.orderService.dto.order.CustomerOrderDetails;
import com.anirudhbhatnagar.orderService.dto.product.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Arrays;

public class CustomerOrderDetailsTest {

    @Test
    public void test() throws JsonProcessingException {
        final CustomerOrderDetails customer = CustomerOrderDetails.builder()
                .orderId("1234")
                .externalReference("234257hf")
                .customer(Customer.builder()
                        .firstName("anirudh")
                        .lastName("bhatnagar")
                        .address(Address.builder().addressLine1("123")
                                .city("Syd")
                                .country("Aus").build())
                        .email("test@test.com").build())
                .items(Arrays.asList(
                        com.anirudhbhatnagar.orderService.dto.product.Item.builder()
                                .product(Product
                                        .builder()
                                        .name("Nike Shoes")
                                        .description("Mens shoes")
                                        .sku("1234")
                                        .price("100").build()).build()))
                .build();
        ObjectMapper o = new ObjectMapper();
        System.out.println(o.writeValueAsString(customer));

    }
}
