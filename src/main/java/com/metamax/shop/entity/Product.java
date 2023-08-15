package com.metamax.shop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "brand_id")
    private Long brandId;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
}
