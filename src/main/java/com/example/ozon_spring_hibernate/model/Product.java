package com.example.kufar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

/**
 * Класс опиывает продукт
 *     productName;
 *     category;
 *     price;
 *     location;
 *     sellerName;
 *     sellerPhone;
 */

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//https://www.kufar.by/ain/create
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String productName;
    @ManyToOne
    Category category;
    BigDecimal price;
    @ManyToOne
    Region location;
    @ManyToOne
    Account seller;
    @Enumerated(EnumType.STRING)
    PayType payType;
    String sellerName;
    String sellerPhone;
}