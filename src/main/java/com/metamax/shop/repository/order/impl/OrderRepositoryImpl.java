package com.metamax.shop.repository.order.impl;

import com.metamax.shop.entity.Order;
import com.metamax.shop.repository.order.OrderRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository("order.repository")
public class OrderRepositoryImpl implements OrderRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public long save(Order order) {
        entityManager. persist(order);
        return order.getId();
    }
}
