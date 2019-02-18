package com;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.crossengage.repository.UserRepo;

public class UserRepositoryTest {

	private static final String FILE_PATH = "src/test/resources/test_user_data.txt";
	UserRepo userRepo = new UserRepo();

	//Test the resourse path that is exist
	@Test
	public void testFileExist() throws Exception {
		File file = new File("src/test/resources/test_user_data.txt");

		assertTrue(file.exists());

	}

	@Test
	public void testActiveUserFromData() {
		assertEquals(4, userRepo.findAll(FILE_PATH).getUsers().size());
	}

	@Test
	public void test() throws IOException {

		assertThat(true);
	}
}
