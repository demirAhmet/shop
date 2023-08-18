package com.metamax.shop.controller;

import com.metamax.shop.model.front.ProductFrontModel;
import com.metamax.shop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    private final ProductService productService;


    @RequestMapping("/urunler")
    public String getProducts(Map<String, Object> map) {
        List<ProductFrontModel> products = productService.getProducts();
        map.put("products", products);
        return "product/list";
    }


    public ProductController(@Qualifier("product.service") ProductService productService) {
        this.productService = productService;
    }
}
