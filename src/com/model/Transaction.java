package com.model;

import java.util.List;

public class Transaction {
	
	private String transactionID;
	
	private Double transactionAmount;
	
	private TransactionMode transactionMode;
	
	private User payer;
	
	private List<User> consumer;

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public TransactionMode getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(TransactionMode transactionMode) {
		this.transactionMode = transactionMode;
	}

	public User getPayer() {
		return payer;
	}

	public void setPayer(User payer) {
		this.payer = payer;
	}

	public List<User> getConsumer() {
		return consumer;
	}

	public void setConsumer(List<User> consumer) {
		this.consumer = consumer;
	}
	
	
	
	
	

}
