package com.model;

import java.util.List;
import java.util.Map;

public class PercentageMode implements TransactionMode {

	@Override
	public void splitAmount(User payer, List<User> consumers, Map<Integer, User> activeUser, Double amount,
			List<Double> splitted) throws Exception {

		for (int i = 0; i < consumers.size(); i++) {

			//u1 //u2,u3
			
			User consumer = consumers.get(i);// u2
			
			if(payer.getUserId()==consumer.getUserId())
				continue;
			
			if (activeUser.get(consumer.getUserId()) == null) {
				throw new Exception("No Active User found for userid" + consumer.getUserId());
			}

			Double existingAmout = consumer.getOweBalance().getOrDefault(payer.getUserId(), 0.0);

			Double updatedAmount = existingAmout +((amount/100)* splitted.get(i));

//			//u1 u4
//			Double payConsumer=payer.getOweBalance().get(consumer.getUserId());
			
			//u4 u1
			consumer.getOweBalance().put(payer.getUserId(), updatedAmount);
		
			activeUser.put(consumer.getUserId(), consumer);
		}

	}

}
