package com.jen.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdApplication implements CommandLineRunner{

	public static final Logger logger=LoggerFactory.getLogger(CicdApplication.class);
	public static void main(String[] args) {
		logger.info("starting debugging continues intregration job");
		SpringApplication.run(CicdApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its my second logger");
	}

}
