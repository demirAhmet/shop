package com.metamax.shop.model.payment;

public class CardInfo {
    private String clintName;
    private String cardNumber;
    private short cvv;
    private short expireMonth;
    private short expireYear;

    public String getClintName() {
        return clintName;
    }

    public void setClintName(String clintName) {
        this.clintName = clintName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getCvv() {
        return cvv;
    }

    public void setCvv(short cvv) {
        this.cvv = cvv;
    }

    public short getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(short expireMonth) {
        this.expireMonth = expireMonth;
    }

    public short getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(short expireYear) {
        this.expireYear = expireYear;
    }
}
