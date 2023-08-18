package com.metamax.shop.service;

import com.metamax.shop.service.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NotificationServiceTest {
    @Autowired
    NotificationService notificationService;

    @Test
    void sendMail(){
        //mail gönderim işlemi için test metodu
    }
}
