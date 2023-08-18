package com.metamax.shop.exception;

public class MetamaxBusinessException extends MetamaxBaseException {
    public MetamaxBusinessException(String code, String message) {
        super(code, message);
    }
}
