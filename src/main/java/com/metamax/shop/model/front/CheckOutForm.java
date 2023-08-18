package com.metamax.shop.model.front;

public class CheckOutForm {

    private String clientName;
    private String clientAddress;
    private String creditCardOwnerName;
    private String creditCardNumber;
    private String creditCardExpireMonth;
    private String creditCardExpireYear;
    private String creditCardCVVNumber;
    private String shippingCode;
    private Double totalProductValue;
    private Long productId;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getCreditCardOwnerName() {
        return creditCardOwnerName;
    }

    public void setCreditCardOwnerName(String creditCardOwnerName) {
        this.creditCardOwnerName = creditCardOwnerName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpireMonth() {
        return creditCardExpireMonth;
    }

    public void setCreditCardExpireMonth(String creditCardExpireMonth) {
        this.creditCardExpireMonth = creditCardExpireMonth;
    }

    public String getCreditCardExpireYear() {
        return creditCardExpireYear;
    }

    public void setCreditCardExpireYear(String creditCardExpireYear) {
        this.creditCardExpireYear = creditCardExpireYear;
    }

    public String getCreditCardCVVNumber() {
        return creditCardCVVNumber;
    }

    public void setCreditCardCVVNumber(String creditCardCVVNumber) {
        this.creditCardCVVNumber = creditCardCVVNumber;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public Double getTotalProductValue() {
        return totalProductValue;
    }

    public void setTotalProductValue(Double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
