package com.metamax.shop.repository.product.impl;

import com.metamax.shop.entity.Product;
import com.metamax.shop.repository.product.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("product.repository")
public class ProductRepositoryImpl  implements ProductRepository {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Product> getProducts() {
        return entityManager.createQuery("select p from Product p")
                .getResultList();
    }
}
