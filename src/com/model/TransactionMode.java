package com.model;

import java.util.List;
import java.util.Map;

public interface TransactionMode {
	
	
	public void splitAmount(User payer,List<User> consumers,Map<Integer,User> activeUser,Double Amount,List<Double> splitted) throws Exception;

}
