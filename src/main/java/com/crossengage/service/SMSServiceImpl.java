package com.crossengage.service;

import com.crossengage.service.impl.MessageService;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message, String reciever, String text) {
		System.out.println(message + " sent to " + reciever + " with text: " + text);
	}

}
