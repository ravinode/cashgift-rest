package org.rk.cashgift.springboot.controller;

import java.util.List;

import javax.sql.DataSource;

import org.rk.cashgift.springboot.dao.TransactionRepository;
import org.rk.cashgift.springboot.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	DataSource dataSource;

	@Autowired
	private TransactionRepository transactionRep;

	@RequestMapping(value = "/getTransaction", method = RequestMethod.GET)
	public List<Transaction> getAllTransaction() {
		List<Transaction> list = null;
		try {
			
		list = transactionRep.findAllTransactions();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// list.forEach(x -> System.out.println(x.getG_STATE()));
		return list;
	}
}
