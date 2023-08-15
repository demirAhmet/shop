package com.metamax.shop.service.product.impl;

import com.metamax.shop.entity.Product;
import com.metamax.shop.model.BrandFrontModel;
import com.metamax.shop.model.ProductFrontModel;
import com.metamax.shop.repository.product.ProductRepository;
import com.metamax.shop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service("product.service")
public class ProductServiceImpl  implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(@Qualifier("product.repository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductFrontModel> getProduct() {
        List<Product> productEntities =productRepository.getProducts();

        if (CollectionUtils.isEmpty(productEntities)){
            return null;
        }

        List<ProductFrontModel> productList=new ArrayList<>();
        productEntities.forEach(a->{
            productList.add(new ProductFrontModel(a.getId(),a.getName(),new BrandFrontModel(a
                    .getBrand().getId(),a.getBrand().getName()),a.getPrice()));
        });
        return productList;
    }
}
