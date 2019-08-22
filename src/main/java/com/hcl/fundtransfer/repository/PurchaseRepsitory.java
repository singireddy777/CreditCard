package com.hcl.fundtransfer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.fundtransfer.entity.Purchase;

@Repository
public interface PurchaseRepsitory extends JpaRepository<Purchase, Integer>{

	Optional<Purchase>findByPrice(@Param ("price")Double price);
}
