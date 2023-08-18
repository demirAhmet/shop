package com.metamax.shop.service.product;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.ProductFrontModel;

import java.util.List;

public interface ProductService {
    List<ProductFrontModel> getProducts();

    ProductFrontModel getProductById(long id);
}
