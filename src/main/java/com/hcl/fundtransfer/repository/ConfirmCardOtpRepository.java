package com.hcl.fundtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.fundtransfer.entity.CardDetails;

@Repository
public interface ConfirmCardOtpRepository extends JpaRepository<CardDetails, Integer>{

}
