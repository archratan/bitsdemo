package com.bits.ms.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.bits.ms.model.Merchant;
import com.bits.ms.model.MerchantClass;

@Service
public class MerchantClassifierService {
     String[] businessTypes = {"TopClass","MidClass","LowerClass"};
	  String [] merchantCategory ={"Domestic","Rural","Urban"};
	  Random rd = new Random();
	  
	public MerchantClass classifyMerchant(Merchant mrch )
	{
		 MerchantClass mclass = new MerchantClass();
		 mclass.setMerchantBusinessType(businessTypes[rd.nextInt(0, 2)]);
		 mclass.setMerchantCategory(merchantCategory[rd.nextInt(0, 2)]);
		 return mclass;
	}
}
