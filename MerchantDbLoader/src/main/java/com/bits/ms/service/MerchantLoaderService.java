package com.bits.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.bits.ms.model.MerchantProfile;

@Service
public class MerchantLoaderService {
	@Autowired
	private MongoTemplate mongoTempate;
	
	public MerchantProfile captureMerchantProfile(MerchantProfile merchantProfile)
	{
		
		try {
			mongoTempate.save(merchantProfile);
			System.out.println("MerchantProfile  done");
		} catch (Exception e) {
			System.out.println("MerchantProfile could not be  done"+ e.toString());
				}
		
		return merchantProfile;
		
	}
	
	public List<MerchantProfile> getAllMerchantProfileData()
	{
		try {
			List<MerchantProfile> list = mongoTempate.findAll(MerchantProfile.class);
			System.out.println("getAll MerchantProfile  done");
			return list;
		} catch (Exception e) {
			System.out.println("getAll MerchantProfile could not be  done"+ e.toString());
			return null;
				}
		
		
	}
	
	
	
}
