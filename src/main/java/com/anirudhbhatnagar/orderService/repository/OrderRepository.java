package com.anirudhbhatnagar.orderService.repository;

import com.anirudhbhatnagar.orderService.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(String customerId);
}
