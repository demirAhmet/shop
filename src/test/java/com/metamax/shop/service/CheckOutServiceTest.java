package com.metamax.shop.service;

import com.metamax.shop.model.front.CheckOutForm;
import com.metamax.shop.service.checkout.CheckOutService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CheckOutServiceTest {

    @Autowired
    CheckOutService checkOutService;


    @Test
    void checkOut() {
        Assertions.assertDoesNotThrow(() -> {
            CheckOutForm checkOutForm = new CheckOutForm();
            checkOutForm.setClientName("Ahmet Demir");
            checkOutForm.setClientAddress("İstanbul");
            checkOutForm.setCreditCardOwnerName("Ahmet Demir");
            checkOutForm.setCreditCardNumber("666666666666666");
            checkOutForm.setCreditCardExpireMonth("6");
            checkOutForm.setCreditCardExpireYear("2027");
            checkOutForm.setCreditCardCVVNumber("543");
            checkOutForm.setShippingCode("EXPRESS");
            checkOutForm.setTotalProductValue(20D);
            checkOutForm.setProductId(3456L);
            checkOutService.checkOut(checkOutForm);
        });
    }
}
