package com.pkc.springbootmicroservice2purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkc.springbootmicroservice2purchase.model.Purchase;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{
    //findBy+fieldName

    List<Purchase> findAllByUserId(Long userId);
}
