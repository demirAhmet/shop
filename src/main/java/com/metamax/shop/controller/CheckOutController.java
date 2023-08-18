package com.metamax.shop.controller;

import com.metamax.shop.exception.MetamaxBusinessException;
import com.metamax.shop.exception.MetamaxTechnicalException;
import com.metamax.shop.model.front.CheckOutForm;
import com.metamax.shop.model.front.ProductFrontModel;
import com.metamax.shop.service.checkout.CheckOutService;
import com.metamax.shop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class CheckOutController {
    private final ProductService productService;
    private final CheckOutService checkOutService;


    @GetMapping("/checkout/{productId}")
    public String checkOut(@PathVariable Long productId,
                           Map<String, Object> map) {
        if (productId <= 0) {
            return "/urunler";
        }

        ProductFrontModel product = productService.getProductById(productId);
        if (product == null || product.getId() <= 0) {
            return "/urunler";
        }
        map.put("product", product);
        return "checkout/checkout";
    }

    @PostMapping("/checkout")
    public String checkOut(@RequestParam(value = "clientName") String clientName,
                           @RequestParam(value = "clientAddress") String clientAddress,
                           @RequestParam(value = "creditCardOwnerName") String creditCardOwnerName,
                           @RequestParam(value = "creditCardNumber") String creditCardNumber,
                           @RequestParam(value = "creditCardExpireMonth") String creditCardExpireMonth,
                           @RequestParam(value = "creditCardExpireYear") String creditCardExpireYear,
                           @RequestParam(value = "creditCardCVVNumber") String creditCardCVVNumber,
                           @RequestParam(value = "shippingCode") String shippingCode,
                           @RequestParam(value = "totalProductValue") Double totalProductValue,
                           @RequestParam(value = "productId") Long productId,
                           Map<String, Object> map) {
        if (productId == null || productId <= 0) {
            return "/urunler";
        }

        try {
            CheckOutForm checkOutForm = new CheckOutForm();
            checkOutForm.setClientName(clientName);
            checkOutForm.setClientAddress(clientAddress);
            checkOutForm.setCreditCardOwnerName(creditCardOwnerName);
            checkOutForm.setCreditCardNumber(creditCardNumber);
            checkOutForm.setCreditCardExpireMonth(creditCardExpireMonth);
            checkOutForm.setCreditCardExpireYear(creditCardExpireYear);
            checkOutForm.setCreditCardCVVNumber(creditCardCVVNumber);
            checkOutForm.setShippingCode(shippingCode);
            checkOutForm.setTotalProductValue(totalProductValue);
            checkOutForm.setProductId(productId);
            checkOutService.checkOut(checkOutForm);
            return "checkout/thank-you";
        } catch (MetamaxBusinessException | MetamaxTechnicalException e) {
            map.put("errorCode", e.getCode());
            return "/checkout/{productId}";
        }
    }

    public CheckOutController(@Qualifier("product.service") ProductService productService,
                              @Qualifier("checkout.service") CheckOutService checkOutService) {
        this.productService = productService;
        this.checkOutService = checkOutService;
    }
}
