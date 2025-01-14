//package com.example.ecommerce_springboot.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//
//@Setter
//@Getter
//
//@Entity
//@Table(name = "order_details")
//public class OrderDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ORDER_DETAILS_ID", nullable = false, updatable = false)
//    private Long orderDetailsId;
//
//    @ManyToOne
//    @JoinColumn(name = "ORDER_ID", nullable = false)
//    private OrderMaster orderMaster;
//
//    @Column(name = "PRODUCT_ID", nullable = false)
//    private Long productId;
//
//    @Column(name = "PRODUCT_NAME", nullable = false)
//    private String productName;
//
//    @Column(name = "QUANTITY", nullable = false)
//    private int quantity;
//
//    @Column(name = "UNIT_PRICE", nullable = false)
//    private double unitPrice;
//
//    @Column(name = "SUBTOTAL", nullable = false)
//    private double subtotal;
//
//    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
//    private String description;
//
//    @Column(name = "CATEGORY", nullable = false)
//    private String category;
//
//    @Column(name = "IMAGE_URL")
//    private String imageUrl;
//}
//
