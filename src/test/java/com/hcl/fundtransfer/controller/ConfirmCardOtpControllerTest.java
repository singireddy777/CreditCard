package com.hcl.fundtransfer.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.fundtransfer.dto.ConfirmOtpRequestDto;
import com.hcl.fundtransfer.dto.ConfirmOtpResponseDto;
import com.hcl.fundtransfer.service.ConfirmCardOtpServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
public class ConfirmCardOtpControllerTest {
	
	@Mock ConfirmCardOtpServiceImpl confirmCardOtpServiceImpl;
	@InjectMocks ConfirmCardOtpController confirmCardOtpController;
	@Autowired
	MockMvc mockmvc;
	ConfirmOtpRequestDto confirmOtpRequestDto;
	ConfirmOtpResponseDto confirmOtpResponseDto;
	@Before
	public void setUp() {
		mockmvc = MockMvcBuilders.standaloneSetup(confirmCardOtpController).build();
		confirmOtpRequestDto = new ConfirmOtpRequestDto();
		confirmOtpRequestDto.setCardId(2);
		
		confirmOtpResponseDto = new ConfirmOtpResponseDto();
		confirmOtpResponseDto.setMessage("otp verified successfully");
	}
	@Test
	public void confirmOtpTest() throws Exception{
		mockmvc.perform(MockMvcRequestBuilders.post("/api/comfirmOtp")
				.contentType(MediaType.APPLICATION_JSON).content(asJsonString(confirmOtpResponseDto))
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
}
