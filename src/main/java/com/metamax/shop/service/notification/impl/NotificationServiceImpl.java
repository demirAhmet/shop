package com.metamax.shop.service.notification.impl;

import com.metamax.shop.service.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service("notification.service")
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendMail(long orderId, String emailAddress) {
        //email sent to admin
        return;
    }
}
