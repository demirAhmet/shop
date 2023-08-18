package com.metamax.shop.service.payment.impl;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.payment.PaymentInfo;
import com.metamax.shop.service.payment.PaymentService;
import org.springframework.stereotype.Service;

@Service("xBank-payment.service")
public class XBankPaymentServiceImpl implements PaymentService {
    @Override
    public void pay(PaymentInfo paymentInfo)  throws MetamaxBusinessException, MetamaxTechnicalException {
        //Odeme islemin gerceklestirildi.
    }
}
