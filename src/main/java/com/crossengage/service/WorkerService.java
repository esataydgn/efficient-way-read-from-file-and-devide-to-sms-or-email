package com.crossengage.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.crossengage.model.User;
import com.crossengage.multitask.MassageSenderThread;
import com.crossengage.repository.UserRepo;
import com.crossengage.store.UserStore;

public class WorkerService {

	private static final String FILE_PATH = "src/test/resources/test_user_data.txt";

	public void doProcesses() {

		UserRepo userRepo = new UserRepo();
		UserStore users = userRepo.findAll(FILE_PATH);

		createThreads(users);

	}

	public void createThreads(UserStore users) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
		for (User user : users.getUsers()) {
			Runnable thread = new MassageSenderThread(user);
			executor.execute(thread);
		}
		executor.shutdown();
	}

}
