package com.bits.ms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MerchantProfile")
public class MerchantProfile {
 	@Id
	@Indexed(name="_id")
 	 String id;
 	
 	String name;
	 String addr;
	 String merchantBusinessType;
	 String merchantCategory;
	 String verificationStatus;
	
	 public void setId(String id) {
		this.id = id;
	}
	 public String getId() {
		return id;
	}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	} 
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMerchantBusinessType() {
		return merchantBusinessType;
	}
	public void setMerchantBusinessType(String merchantBusinessType) {
		this.merchantBusinessType = merchantBusinessType;
	}
	public String getMerchantCategory() {
		return merchantCategory;
	}
	public void setMerchantCategory(String merchantCategory) {
		this.merchantCategory = merchantCategory;
	}
	 
	 
	 
	 
}
