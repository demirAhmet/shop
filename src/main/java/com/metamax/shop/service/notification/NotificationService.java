package com.metamax.shop.service.notification;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;

public interface NotificationService {
    void sendMail(long orderId, String emailAddress) throws MetamaxBusinessException, MetamaxTechnicalException;
}
