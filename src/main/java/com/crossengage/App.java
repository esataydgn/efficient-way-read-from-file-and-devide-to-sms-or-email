package com.crossengage;

import java.io.IOException;

import com.crossengage.service.WorkerService;

public class App {

	public static void main(String[] args) throws IOException {

		WorkerService processor = new WorkerService();
		processor.doProcesses();

	}
}
