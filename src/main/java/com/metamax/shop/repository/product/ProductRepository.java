package com.metamax.shop.repository.product;

import com.metamax.shop.entity.Product;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts() throws MetamaxBusinessException, MetamaxTechnicalException;

    Product getProductById(long id) throws MetamaxBusinessException, MetamaxTechnicalException;
}
