package com.bits.ms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ms.model.MerchantProfile;
import com.bits.ms.service.MerchantVerifierService;

@RestController
public class MerchantVerifier {
	

	
	@Autowired
	MerchantVerifierService merchantVerifierService;
	
	 @GetMapping("/verifyMerchant")
	  MerchantProfile  checkMerchantVerified(@RequestParam String  merchantId ) {
		 return merchantVerifierService.verifyService(merchantId);
	  }

	 
}
