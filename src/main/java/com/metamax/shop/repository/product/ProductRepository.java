package com.metamax.shop.repository.product;

import com.metamax.shop.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
}
