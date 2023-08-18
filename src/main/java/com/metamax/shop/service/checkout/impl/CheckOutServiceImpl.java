package com.metamax.shop.service.checkout.impl;

import com.metamax.shop.exception.MetamaxBaseException;
import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.CheckOutForm;
import com.metamax.shop.model.front.OrderFrontModel;
import com.metamax.shop.model.payment.CardInfo;
import com.metamax.shop.model.payment.PaymentInfo;
import com.metamax.shop.repository.order.OrderRepository;
import com.metamax.shop.service.checkout.CheckOutService;
import com.metamax.shop.service.notification.NotificationService;
import com.metamax.shop.service.order.OrderService;
import com.metamax.shop.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("checkout.service")
public class CheckOutServiceImpl implements CheckOutService {
    private final OrderService orderService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;

    public CheckOutServiceImpl(@Qualifier("order.service") OrderService orderService,
                               @Qualifier("notification.service") NotificationService notificationService,
                               @Qualifier("xBank-payment.service") PaymentService paymentService) {
        this.orderService = orderService;
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }

    @Override
    public void checkOut(CheckOutForm checkOutForm) throws MetamaxBusinessException, MetamaxTechnicalException {
        try {

            PaymentInfo paymentInfo = getPaymentInfo(checkOutForm);
            paymentService.pay(paymentInfo);


            OrderFrontModel orderFrontModel = new OrderFrontModel();
            orderFrontModel.setClientAddress(checkOutForm.getClientAddress());
            orderFrontModel.setClientName(checkOutForm.getClientName());
            orderFrontModel.setTotalProductValue(checkOutForm.getTotalProductValue());
            orderFrontModel.setProductId(checkOutForm.getProductId());

            if (checkOutForm.getShippingCode().equals("EXPRESS")) {
                orderFrontModel.setTotalShippingValue(10);
            }
            long orderId = orderService.saveOrder(orderFrontModel);
            notificationService.sendMail(orderId, "ahmet3demir@gmail.com");
        } catch (MetamaxBusinessException | MetamaxTechnicalException exception) {
            throw exception;
        } catch (Exception e) {
            throw new MetamaxTechnicalException("error.code.checkOut", e.getMessage());
        }
    }

    private PaymentInfo getPaymentInfo(CheckOutForm checkOutForm) {
        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardNumber(cardInfo.getCardNumber());
        cardInfo.setCvv(cardInfo.getCvv());
        cardInfo.setClintName(cardInfo.getClintName());
        cardInfo.setExpireMonth(cardInfo.getExpireMonth());
        cardInfo.setExpireYear(cardInfo.getExpireYear());

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setCardInfo(cardInfo);
        paymentInfo.setPrice(checkOutForm.getTotalProductValue());
        return paymentInfo;
    }
}
