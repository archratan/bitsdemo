package com.bits.ms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ms.model.Merchant;
import com.bits.ms.model.MerchantClass;
import com.bits.ms.service.MerchantClassifierService;

@RestController
public class MerchantClassifier {
	
	
	@Autowired
	MerchantClassifierService merchantClassifierService;
	
	 @PostMapping("/classifyMerchant")
	  MerchantClass  generarteSampleQuoteData(@RequestBody Merchant  merchant ) {
		 return merchantClassifierService.classifyMerchant(merchant);
	 
		 
	 }

}
