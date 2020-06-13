package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("You are in contextLoads test method");
	}

}
