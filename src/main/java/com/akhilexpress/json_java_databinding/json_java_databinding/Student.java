package com.akhilexpress.json_java_databinding.json_java_databinding;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties(value = "isActive")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("fullName")
	private String name;
	private String address;
	@JsonProperty("isActive")
	private boolean isActive;// @JsonIgnoreProperties(value = "isActive")
	private String[] phoneNo;
	private Batch batch;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", isActive=" + isActive + ", phoneNo="
				+ Arrays.toString(phoneNo) + ", batch=" + batch + "]";
	}


	
	
}
