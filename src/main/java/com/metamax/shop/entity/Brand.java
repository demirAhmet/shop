package com.metamax.shop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="brand")
public class Brand {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
@Column(name = "name")
    private String name;
}
