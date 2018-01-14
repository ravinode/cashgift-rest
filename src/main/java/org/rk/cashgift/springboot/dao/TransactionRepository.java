package org.rk.cashgift.springboot.dao;

import java.util.List;

import org.rk.cashgift.springboot.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	 public List<Transaction> findAllTransactions() {

	        List<Transaction> result = jdbcTemplate.query(
	                "SELECT TRANSACTION_ID, TRANSACTION_USER, G_USER_NAME, G_RELATIVE,G_ADDRESS , G_DISTRICT, G_STATE "
	                + ",G_AMOUNT, CREATED_AT FROM CG_TRANSACTION",
	                (rs, rowNum) -> new Transaction(
	                		   rs.getString("TRANSACTION_ID"),
	                		   rs.getString("TRANSACTION_USER"), 
	                        rs.getString("G_USER_NAME"), 
	                        rs.getString("G_RELATIVE"),
	                        rs.getString("G_ADDRESS"),
	                        rs.getString("G_DISTRICT"),
	                        rs.getString("G_STATE"),
	                        rs.getString("G_AMOUNT"),
	                        rs.getString("CREATED_AT"))
	        );

	        return result;

	    }

	
}
