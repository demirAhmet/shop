package com.metamax.shop.service;

import com.metamax.shop.model.front.ProductFrontModel;
import com.metamax.shop.service.product.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductTestService {

    @Autowired
    ProductService productService;

    @Test
    void getProducts() {
        List<ProductFrontModel> productList = productService.getProducts();
        Assertions.assertNotNull(productList);
        Assertions.assertFalse(productList.isEmpty());
    }

    @Test
    void getProductById() {
        long productId = 3456;
        ProductFrontModel product = productService.getProductById(productId);
        Assertions.assertNotNull(product);
        Assertions.assertTrue(product.getId() > 0);
    }


}
