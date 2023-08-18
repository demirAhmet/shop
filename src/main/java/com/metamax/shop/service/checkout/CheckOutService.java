package com.metamax.shop.service.checkout;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.CheckOutForm;

public interface CheckOutService {
    void checkOut(CheckOutForm checkOutForm) throws MetamaxBusinessException, MetamaxTechnicalException;
}
