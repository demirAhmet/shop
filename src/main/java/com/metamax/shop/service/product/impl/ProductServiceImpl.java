package com.metamax.shop.service.product.impl;

import com.metamax.shop.entity.Product;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.BrandFrontModel;
import com.metamax.shop.model.front.ProductFrontModel;
import com.metamax.shop.repository.product.ProductRepository;
import com.metamax.shop.service.product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service("product.service")
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final ProductRepository productRepository;

    public ProductServiceImpl(@Qualifier("product.repository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductFrontModel> getProducts() {
        List<Product> productEntities;
        try {
            productEntities = productRepository.getProducts();
        } catch (MetamaxBusinessException | MetamaxTechnicalException e) {
            logger.error(e.getCode(), e);
            return null;
        }

        if (CollectionUtils.isEmpty(productEntities)) {
            return null;
        }

        List<ProductFrontModel> productList = new ArrayList<>();
        productEntities.forEach(a -> productList.add(fromEntity(a)));
        return productList;
    }

    @Override
    public ProductFrontModel getProductById(long id) {
        try {
            Product product = productRepository.getProductById(id);
            return fromEntity(product);
        } catch (MetamaxBusinessException | MetamaxTechnicalException e) {
            logger.error(e.getCode(), e);
            return null;
        }
    }


    ProductFrontModel fromEntity(Product product) {
        if (product == null || product.getId() <= 0) {
            return null;
        }

        ProductFrontModel productFrontModel = new ProductFrontModel();
        productFrontModel.setId(product.getId());
        productFrontModel.setName(product.getName());
        productFrontModel.setPrice(product.getPrice());

        if (product.getBrand() != null && product.getBrand().getId() > 0) {
            BrandFrontModel brand = new BrandFrontModel();
            brand.setId(product.getBrand().getId());
            brand.setName(product.getBrand().getName());
            productFrontModel.setBrand(brand);
        }

        return productFrontModel;
    }
}
