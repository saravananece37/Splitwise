package com.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class RequestProcessor {

	
	static RequestProcessor requestProcessor=null;
	
	private Map<Integer, User> users;

	private Transaction transaction;

	private User payer;

	private Double paidAmount;

	private TransactionMode mode;

	private List<User> consumers;

	private RequestProcessor() {
		users = new HashMap();
	}
	
	public static synchronized RequestProcessor getInstance()
	{
		return requestProcessor==null ? new RequestProcessor(): requestProcessor;
	}
	
	

	public void addNewUser(User user) {
		users.put(user.getUserId(), user);
	}

	public void addNewTransaction(User payer, Double paidAmount, List<User> consumers, TransactionMode transactionMode,
			List<Double> splitted) throws Exception {

		initializeTx(payer, paidAmount, consumers, transactionMode, splitted);
		createNewTranaction();
		transactionMode.splitAmount(payer, consumers, this.users, this.paidAmount, splitted);
		updateActiveUsers();
	}

	private void initializeTx(User payer, Double paidAmount, List<User> consumers, TransactionMode transactionMode,
			List<Double> splitted) {
		this.payer = payer;

		this.mode = transactionMode;

		this.paidAmount = paidAmount;

		this.consumers = consumers;
	}

	private void createNewTranaction() {
		transaction = new Transaction();

		transaction.setConsumer(consumers);

		transaction.setPayer(payer);

		transaction.setTransactionAmount(paidAmount);

		transaction.setTransactionID(UUID.randomUUID().toString());

	}

	public void printListOfUser() {
		System.out.println("Available List of Users");
		this.users.entrySet().forEach(System.out::println);
	}

	public void displayOweBalance(User user) {
		User temp = this.users.get(user.getUserId());
		System.out.println("User ID " + user.getUserId() + "Owe Balance " + temp.getOweBalance());
	}
	
	//u1 u2 u3 u4 u5
	//u5 -> 

	public void displayAllOweBalance() {
		for (Map.Entry<Integer, User> user : this.users.entrySet()) {
			System.out.println("UserID " + user.getKey() + "User OwBalace " + user.getValue().getOweBalance().toString());
		}
	}
	
	private void updateActiveUsers()
	{
		for (Map.Entry<Integer, User> user : this.users.entrySet()) {
			
			for(int i=0;i<user.getValue().getOweBalance().size();i++)
			{
				//update All
			}
		}
		
	}

}
