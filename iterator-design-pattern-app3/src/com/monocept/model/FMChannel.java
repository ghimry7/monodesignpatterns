package com.monocept.model;

public class FMChannel {
	private float frequency;
	private Language language;
	private FMChannel next = null;
	private FMChannel prev;

	public FMChannel(float frequency, Language language) {
		this.frequency = frequency;
		this.language = language;
	}

	public float getFrequency() {
		return frequency;
	}

	public Language getLanguage() {
		return language;
	}

	public FMChannel getNext() {
		return next;
	}

	public void setNext(FMChannel next) {
		this.next = next;
	}

	public FMChannel getPrev() {
		return prev;
	}

	public void setPrev(FMChannel prev) {
		this.prev = prev;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "FMChannel [frequency=" + frequency + ", language=" + language + "]";
	}

}
