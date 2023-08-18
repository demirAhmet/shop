package com.metamax.shop.repository.order;

import com.metamax.shop.entity.Order;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;

public interface OrderRepository {
    long save(Order order) throws MetamaxBusinessException, MetamaxTechnicalException;
}
