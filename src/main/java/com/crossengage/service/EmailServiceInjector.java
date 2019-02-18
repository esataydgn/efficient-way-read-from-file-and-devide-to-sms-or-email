package com.crossengage.service;

import com.crossengage.service.impl.MessageServiceInjector;
import com.crossengage.service.impl.ProcessorService;

public class EmailServiceInjector implements MessageServiceInjector{

	@Override
	public ProcessorService getProcessor() {
		// TODO Auto-generated method stub
		return new ProcessorServiceImpl(new EmailServiceImpl());
	}

}
