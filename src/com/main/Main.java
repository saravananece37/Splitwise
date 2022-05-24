package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.EqualMode;
import com.model.ExactMode;
import com.model.PercentageMode;
import com.model.RequestProcessor;
import com.model.TransactionMode;
import com.model.User;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user1=new User();
		user1.setUserId(1);
		user1.setUserName("abc");

		User user2=new User();
		user2.setUserId(2);
		user2.setUserName("xyz");

		User user3=new User();
		user3.setUserId(3);
		user3.setUserName("def");

		User user4=new User();
		user4.setUserId(4);
		user4.setUserName("def");
		
		
		RequestProcessor requestProcessor=RequestProcessor.getInstance();
		
		requestProcessor.addNewUser(user1);
		requestProcessor.addNewUser(user2);
		requestProcessor.addNewUser(user3);
		requestProcessor.addNewUser(user4);
		
		
		List<User> consumers=new ArrayList<User>();
		consumers.add(user2);
		consumers.add(user3);
		consumers.add(user4);
		consumers.add(user1);
		
		TransactionMode transactionMode=new EqualMode();
		
		List<Double> splitted=new ArrayList<>();
		
		splitted.add(1000.0);
				
		requestProcessor.addNewTransaction(user1, 1000.0, consumers, transactionMode, splitted);
		
		requestProcessor.displayAllOweBalance();
		

		
		//usecase 2
		
		consumers=new ArrayList<User>();
		consumers.add(user2);
		consumers.add(user3);
		
		transactionMode=new ExactMode();
		
		splitted=new ArrayList<>();
		
		splitted.add(370.0);
		splitted.add(880.0);
				
		requestProcessor.addNewTransaction(user1, 1250.0, consumers, transactionMode, splitted);
		
		requestProcessor.displayAllOweBalance();
		
		
		
		consumers=new ArrayList<User>();
		consumers.add(user1);
		consumers.add(user2);
		consumers.add(user3);
		consumers.add(user4);
		
		
		transactionMode=new PercentageMode();
		
		splitted=new ArrayList<>();
		
		splitted.add(40.0);
		splitted.add(20.0);
		splitted.add(20.0);
		splitted.add(20.0);
			
				
		requestProcessor.addNewTransaction(user4, 1200.0, consumers, transactionMode, splitted);
		
		requestProcessor.displayAllOweBalance();

		
	}

}
