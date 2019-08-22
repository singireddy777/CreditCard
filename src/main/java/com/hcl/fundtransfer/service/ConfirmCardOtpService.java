
package com.hcl.fundtransfer.service;
import org.springframework.stereotype.Service;
import com.hcl.fundtransfer.dto.ConfirmOtpRequestDto;
import com.hcl.fundtransfer.dto.ConfirmOtpResponseDto;
@Service
public interface ConfirmCardOtpService {
	ConfirmOtpResponseDto confirmCardOtp(ConfirmOtpRequestDto confirmOtpRequestDto);
}
