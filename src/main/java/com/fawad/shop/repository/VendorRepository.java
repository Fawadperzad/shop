package com.fawad.shop.repository;

import com.fawad.shop.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository
        extends JpaRepository<Vendor, Long> {
}