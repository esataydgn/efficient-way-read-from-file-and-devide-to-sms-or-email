package com.crossengage.store;

public enum ContactType {

	EMAIL("email"), PHONE("SMS"), ALL("all"), NONE("none");

	private String value;

	private ContactType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
