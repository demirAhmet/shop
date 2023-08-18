package com.metamax.shop.service.payment;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.payment.PaymentInfo;

public interface PaymentService {
    void pay(PaymentInfo paymentInfo) throws MetamaxBusinessException, MetamaxTechnicalException;
}
