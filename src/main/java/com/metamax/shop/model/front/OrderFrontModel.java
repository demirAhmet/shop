package com.metamax.shop.model.front;

public class OrderFrontModel {
    private double totalProductValue;
    private double totalShippingValue;
    private String clientName;
    private String clientAddress;
    private long productId;

    public double getTotalProductValue() {
        return totalProductValue;
    }

    public void setTotalProductValue(double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public double getTotalShippingValue() {
        return totalShippingValue;
    }

    public void setTotalShippingValue(double totalShippingValue) {
        this.totalShippingValue = totalShippingValue;
    }

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

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
