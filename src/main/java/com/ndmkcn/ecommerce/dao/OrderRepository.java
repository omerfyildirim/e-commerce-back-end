package com.ndmkcn.ecommerce.dao;

import com.ndmkcn.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders",path = "orders")
public interface OrderRepository extends JpaRepository<Order,Long> {
    Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String theEmail, Pageable pageable);
}
