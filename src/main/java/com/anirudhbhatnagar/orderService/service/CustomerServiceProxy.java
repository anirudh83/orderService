package com.anirudhbhatnagar.orderService.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "permissions-service", url = "localhost:8000")
public interface CustomerServiceProxy {
}
