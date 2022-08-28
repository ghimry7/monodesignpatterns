package com.monocept.test;

import com.monocept.model.ChannelIterator;
import com.monocept.model.ChannelList;
import com.monocept.model.Container;
import com.monocept.model.FMChannel;
import com.monocept.model.Language;

public class Client {

	public static void main(String[] args) {
		FMChannel radioFm1 = new FMChannel(98.6f, Language.ALL);
		FMChannel radioFm2 = new FMChannel(93.5f, Language.BENGALI);
		FMChannel radioFm3 = new FMChannel(101.5f, Language.HINDI);
		Container playStation = new ChannelList();
		playStation.add(radioFm1);
		playStation.add(radioFm2);
		playStation.add(radioFm3);

		ChannelIterator iterator = (ChannelIterator<FMChannel>) playStation.getIterator(Language.ALL);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
