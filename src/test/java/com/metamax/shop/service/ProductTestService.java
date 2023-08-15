package com.metamax.shop.service;

import com.metamax.shop.model.ProductFrontModel;
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
    void getProduct(){
        List<ProductFrontModel> productList=productService.getProduct();
        Assertions.assertNotNull(productList);
        Assertions.assertFalse(productList.isEmpty());
    }


}
