package com.crossengage.service;

import com.crossengage.service.impl.MessageService;
import com.crossengage.service.impl.ProcessorService;

public class ProcessorServiceImpl implements ProcessorService {

	private MessageService messageService;

	public ProcessorServiceImpl(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processMessages(String message, String reciever, String text) {
		this.messageService.sendMessage(message, reciever, text);
	}

}
