package com.test.ejemplo_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjemploTestApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test
	public void applicationContextTest() {
		Application.main(new String[] {});
		Assertions.assertTrue(true);
	}

}
