package com.model;

import java.util.HashMap;
import java.util.Map;

public class User {
	
	private int userId;
	
	private String userName;
	
	private Map<Integer,Double> oweBalance;
	
//	private Map<Integer,Map<Integer,Double> oweBalance;
	

	public User()
	{
		oweBalance=new HashMap<Integer, Double>();
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<Integer, Double> getOweBalance() {
		return oweBalance;
	}

	public void setOweBalance(Map<Integer, Double> oweBalance) {
		this.oweBalance = oweBalance;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", oweBalance=" + oweBalance + "]";
	}
	
	
}
