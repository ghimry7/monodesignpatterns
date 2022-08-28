package com.monocept.subscriber;
import com.monocept.publisher.*;
public interface INotifier {
	public void notifyUser(Accounts account,String tranType);
}
