package com.fawad.shop.repository;

import com.fawad.shop.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository
        extends JpaRepository<Purchase, Long> {
}