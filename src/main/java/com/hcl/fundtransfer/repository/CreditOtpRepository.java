
package com.hcl.fundtransfer.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.fundtransfer.entity.CreditOtp;


@Repository
public interface CreditOtpRepository extends JpaRepository<CreditOtp, Integer> {

	public Optional<CreditOtp> findByOtpNumber(Long otpNumber);

}
