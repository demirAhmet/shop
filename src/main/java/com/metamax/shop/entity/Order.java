package com.metamax.shop.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "'ORDER'")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="total_product_value")
    private Double totalProductValue;
    @Column(name="total_shipping_value")

    private Double totalShippingValue;
    @Column(name="client_name")

    private String clientName;
    @Column(name="client_address")

    private String clientAddress;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalProductValue() {
        return totalProductValue;
    }

    public void setTotalProductValue(Double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public Double getTotalShippingValue() {
        return totalShippingValue;
    }

    public void setTotalShippingValue(Double totalShippingValue) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
