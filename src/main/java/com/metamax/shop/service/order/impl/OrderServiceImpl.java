package com.metamax.shop.service.order.impl;

import com.metamax.shop.entity.Order;
import com.metamax.shop.entity.Product;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.OrderFrontModel;
import com.metamax.shop.repository.order.OrderRepository;
import com.metamax.shop.service.order.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("order.service")
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(@Qualifier("order.repository") OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public long saveOrder(OrderFrontModel orderFrontModel) throws MetamaxTechnicalException, MetamaxBusinessException {
        if (orderFrontModel == null) {
            throw new MetamaxBusinessException("validation.code.order","order cannot be null");
        }

        Order order = new Order();
        order.setClientAddress(orderFrontModel.getClientAddress());
        order.setClientName(orderFrontModel.getClientName());
        order.setTotalProductValue(orderFrontModel.getTotalProductValue());
        order.setTotalShippingValue(orderFrontModel.getTotalShippingValue());
        Product product=new Product();
        product.setId(orderFrontModel.getProductId());
        order.setProduct(product);
        return orderRepository.save(order);
    }
}
