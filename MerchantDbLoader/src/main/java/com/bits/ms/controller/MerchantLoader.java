package com.bits.ms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ms.model.MerchantProfile;
import com.bits.ms.service.MerchantLoaderService;

@RestController
public class MerchantLoader {
	
	
	@Autowired
	MerchantLoaderService MerchantLoaderService;
	
	 @PostMapping("/loadMerchant")
	  MerchantProfile  loadMerchantToDB(@RequestBody MerchantProfile  merchant ) {
		 return MerchantLoaderService.captureMerchantProfile(merchant);
	   }

}
