package com.fawad.shop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private Double totalPrice;

    private LocalDateTime purchaseDate;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}