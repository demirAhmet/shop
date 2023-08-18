package com.metamax.shop.repository;

import com.metamax.shop.entity.Product;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.repository.product.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductRepositoryTestService {

    @Autowired
    ProductRepository productRepository;

    @Test
    void getProducts() throws MetamaxTechnicalException, MetamaxBusinessException {
        List<Product> productList = productRepository.getProducts();
        Assertions.assertNotNull(productList);
        Assertions.assertFalse(productList.isEmpty());
    }

    @Test
    void getProductById() throws MetamaxTechnicalException, MetamaxBusinessException {
        long productId = 3456;
        Product product = productRepository.getProductById(productId);
        Assertions.assertNotNull(product);
        Assertions.assertTrue(product.getId() > 0);
    }
}
