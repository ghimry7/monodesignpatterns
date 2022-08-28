package com.monocept.subscriber;

import com.monocept.publisher.Accounts;

public class SmsNotifier implements INotifier {

	@Override
	public void notifyUser(Accounts account,String tranType) {
		System.out.println("Your Account Number "+account.getAccNumber()+" have been "+tranType+" and current balance is "+account.getBalance());
	}

}
