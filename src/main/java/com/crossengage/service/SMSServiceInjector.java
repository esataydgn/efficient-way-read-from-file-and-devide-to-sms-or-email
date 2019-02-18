package com.crossengage.service;

import com.crossengage.service.impl.MessageServiceInjector;
import com.crossengage.service.impl.ProcessorService;

public class SMSServiceInjector implements MessageServiceInjector{

	@Override
	public ProcessorService getProcessor() {

		return new ProcessorServiceImpl(new SMSServiceImpl());
	}

}
