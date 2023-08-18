package com.metamax.shop.service;

import com.metamax.shop.service.payment.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    void pay(){
        //ödeme işlemi için test metodu
    }
}
