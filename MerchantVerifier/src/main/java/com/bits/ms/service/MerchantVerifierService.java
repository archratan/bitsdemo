package com.bits.ms.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.bits.ms.model.MerchantProfile;
 

@Service
public class MerchantVerifierService {
 
	@Autowired
	private MongoTemplate mongoTempate;
	
	public MerchantProfile verifyService(String mrchId )
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(mrchId));
		MerchantProfile mp = mongoTempate.findOne(query,MerchantProfile.class);
        
		return mp;
	}
}
