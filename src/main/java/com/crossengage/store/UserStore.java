package com.crossengage.store;

import java.util.ArrayList;

import com.crossengage.model.User;

public class UserStore {
	private ArrayList<User> users = new ArrayList<User>();

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}
