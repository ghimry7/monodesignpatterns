package com.monocept.model;

import java.util.Iterator;

public class ChannelIterator<T> implements Iterator<FMChannel> {

	FMChannel current = null;
	Language lang = null;

	public ChannelIterator(ChannelList list, Language lang) {
		current = list.head;
		this.lang = lang;
	}

	@Override
	public boolean hasNext() {
		while (current != null) {
			if ((current != null) && (current.getLanguage().equals(lang) || lang.equals(Language.ALL))) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public FMChannel next() {
		FMChannel fmTemp = current;
		current = current.getNext();
		return fmTemp;
	}

}
