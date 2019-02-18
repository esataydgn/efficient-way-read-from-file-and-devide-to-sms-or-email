package com.crossengage.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.crossengage.model.User;
import com.crossengage.store.UserStore;

public class UserRepo {

	public UserStore findAll(String filePath) {

		File file = new File(filePath);

		UserStore userStore = new UserStore();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (String line = null; (line = br.readLine()) != null;) {
				String[] stringArr = line.split(",");
				if (isNumeric(stringArr[0]) && stringArr[1].equals("true")) {
					User user = new User();
					user.setId(Integer.parseInt(stringArr[0]));
					user.setActivate(true);
					user.setContactBy(stringArr[2]);
					user.setEmail(stringArr[3]);
					user.setPhone(stringArr[4]);
					userStore.getUsers().add(user);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return userStore;
	}

	public static boolean isNumeric(String maybeNumeric) {
		return maybeNumeric != null && maybeNumeric.matches("[0-9]+");
	}

	public void findOne() {

	}

	// public String findContactType(String contactType) {
	//
	// if (contactType.equals(ContactType.ALL.getValue())) {
	//
	//
	// } else if (contactType.equals(ContactType.EMAIL.getValue())) {
	//
	// } else if (contactType.equals(ContactType.PHONE.getValue())) {
	//
	// } else {
	//
	// }
	//
	// return contactType;
	//
	// }

}
