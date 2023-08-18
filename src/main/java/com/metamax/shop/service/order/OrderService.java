package com.metamax.shop.service.order;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.OrderFrontModel;

public interface OrderService {
    long saveOrder(OrderFrontModel order) throws MetamaxBusinessException, MetamaxTechnicalException;
}
