package com.model;

import java.util.List;
import java.util.Map;

public class EqualMode implements TransactionMode{

	@Override
	public void splitAmount(User payer, List<User> consumers, Map<Integer, User> activeUser, Double Amount,
			List<Double> splitted) throws Exception {
	
		
		Double updatedAmount=splitted.get(0)/consumers.size();
		for (int i = 0; i < consumers.size(); i++) {

			
			User user = consumers.get(i);// u2


			if(payer.getUserId()==user.getUserId())
				continue;
			
			if (activeUser.get(user.getUserId()) == null) {
				throw new Exception("No Active User found for userid" + user.getUserId());
			}

			Double existingAmout = consumers.get(i).getOweBalance().getOrDefault(payer.getUserId(),0.0);

			updatedAmount = existingAmout + splitted.get(0)/(consumers.size());
			
			user.getOweBalance().put(payer.getUserId(), updatedAmount);

			activeUser.put(user.getUserId(), user);
			
		
		}


		
	}

}
