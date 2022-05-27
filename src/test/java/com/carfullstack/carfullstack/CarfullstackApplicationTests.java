package com.carfullstack.carfullstack;

import com.carfullstack.carfullstack.web.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarfullstackApplicationTests {
	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
	}

}
