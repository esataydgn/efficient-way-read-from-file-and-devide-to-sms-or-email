package com.crossengage.multitask;

import com.crossengage.model.User;
import com.crossengage.service.EmailServiceInjector;
import com.crossengage.service.SMSServiceInjector;
import com.crossengage.service.impl.MessageServiceInjector;
import com.crossengage.service.impl.ProcessorService;
import com.crossengage.store.ContactType;

public class MassageSenderThread implements Runnable {

	private User user;

	public MassageSenderThread(User user) {
		this.user = user;
	}

	@Override
	public void run() {

		processMessage();

	}

	private void processMessage() {
		if (user.getContactBy().equals(ContactType.ALL.getValue())) {
			sendEmailAndSms(user);
		} else if (user.getContactBy().equals(ContactType.EMAIL.getValue())) {
			sendEmail(user);
		} else if (user.getContactBy().equals(ContactType.PHONE.getValue())) {
			sendSms(user);
		}else {
			sendSms(user);
		}
	}

	public void sendEmail(User user) {

		MessageServiceInjector processType = new EmailServiceInjector();
		ProcessorService process = processType.getProcessor();

		process.processMessages(ContactType.EMAIL.getValue(), user.getEmail(), "Have a good day!");
	}

	public void sendSms(User user) {

		MessageServiceInjector processType = new SMSServiceInjector();
		ProcessorService process = processType.getProcessor();
		process.processMessages(ContactType.PHONE.getValue(), user.getPhone(), "Have a good day!");
	}

	public void sendEmailAndSms(User user) {
		sendEmail(user);
		sendSms(user);
	}

}
