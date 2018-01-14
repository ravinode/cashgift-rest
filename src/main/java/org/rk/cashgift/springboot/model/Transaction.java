package org.rk.cashgift.springboot.model;

import java.sql.Date;

public class Transaction {

    private String id;
    private String TRANSACTION_USER;
    private String G_USER_NAME ;
    private String G_RELATIVE;
    private String G_ADDRESS;
    private String G_DISTRICT ;
    private String G_STATE ;
    private String G_AMOUNT ;
    private String CREATED_AT;
    
    

 
	public Transaction(String id, String tRANSACTION_USER, String g_USER_NAME, String g_RELATIVE, String g_ADDRESS,
			String g_DISTRICT, String g_STATE, String g_AMOUNT, String cREATED_AT) {
		super();
		this.id = id;
		TRANSACTION_USER = tRANSACTION_USER;
		G_USER_NAME = g_USER_NAME;
		G_RELATIVE = g_RELATIVE;
		G_ADDRESS = g_ADDRESS;
		G_DISTRICT = g_DISTRICT;
		G_STATE = g_STATE;
		G_AMOUNT = g_AMOUNT;
		CREATED_AT = cREATED_AT;
	}

	
	public Transaction(int int1, String string, String string2, Date date) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTRANSACTION_USER() {
        return TRANSACTION_USER;
    }

    public void setTRANSACTION_USER(String TRANSACTION_USER) {
        this.TRANSACTION_USER = TRANSACTION_USER;
    }

    public String getG_USER_NAME() {
        return G_USER_NAME;
    }

    public void setG_USER_NAME(String g_USER_NAME) {
        G_USER_NAME = g_USER_NAME;
    }

    public String getG_RELATIVE() {
        return G_RELATIVE;
    }

    public void setG_RELATIVE(String g_RELATIVE) {
        G_RELATIVE = g_RELATIVE;
    }

    public String getG_ADDRESS() {
        return G_ADDRESS;
    }

    public void setG_ADDRESS(String g_ADDRESS) {
        G_ADDRESS = g_ADDRESS;
    }

    public String getG_DISTRICT() {
        return G_DISTRICT;
    }

    public void setG_DISTRICT(String g_DISTRICT) {
        G_DISTRICT = g_DISTRICT;
    }

    public String getG_STATE() {
        return G_STATE;
    }

    public void setG_STATE(String g_STATE) {
        G_STATE = g_STATE;
    }

    public String getG_AMOUNT() {
        return G_AMOUNT;
    }

    public void setG_AMOUNT(String g_AMOUNT) {
        G_AMOUNT = g_AMOUNT;
    }

    public String getCREATED_AT() {
        return CREATED_AT;
    }

    public void setCREATED_AT(String CREATED_AT) {
        this.CREATED_AT = CREATED_AT;
    }
}
