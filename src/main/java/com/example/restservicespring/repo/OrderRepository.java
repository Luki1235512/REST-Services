package com.example.restservicespring.repo;

import com.example.restservicespring.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
