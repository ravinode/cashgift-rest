package org.rk.cashgift.springboot.model;

import java.sql.Date;

public class Transaction {

    private String id;
    private String transactionUser;
    private String userName ;
    private String relative;
    private String address;
    private String district ;
    private String state ;
    private String amount ;
    private String createdAt;
    
    

 
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction(String id, String transactionUser, String userName, String relative, String address,
			String district, String state, String amount, String createdAt) {
		super();
		this.id = id;
		this.transactionUser = transactionUser;
		this.userName = userName;
		this.relative = relative;
		this.address = address;
		this.district = district;
		this.state = state;
		this.amount = amount;
		this.createdAt = createdAt;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getTransactionUser() {
		return transactionUser;
	}




	public void setTransactionUser(String transactionUser) {
		this.transactionUser = transactionUser;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getRelative() {
		return relative;
	}




	public void setRelative(String relative) {
		this.relative = relative;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getDistrict() {
		return district;
	}




	public void setDistrict(String district) {
		this.district = district;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getAmount() {
		return amount;
	}




	public void setAmount(String amount) {
		this.amount = amount;
	}




	public String getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


}
