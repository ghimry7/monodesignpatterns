package com.monocept.model;

import java.util.Iterator;

public class ChannelList implements Container  {

	FMChannel head = null;

	public void add(FMChannel channel) {
		if (head == null) {
			head = channel;
			return;
		}
		FMChannel temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(channel);

	}
	@Override
	public Iterator getIterator(Language lang) {
		return new ChannelIterator<FMChannel>(this,lang);
	}

}
