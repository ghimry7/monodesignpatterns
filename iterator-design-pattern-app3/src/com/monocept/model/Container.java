package com.monocept.model;

import java.util.Iterator;

public interface Container {
	Iterator getIterator(Language lang);
	void add(FMChannel channel);

}
