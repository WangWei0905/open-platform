package com.wangwei;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenPlatformApplication {
	private static final Logger logger = Logger.getLogger(OpenPlatformApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OpenPlatformApplication.class, args);
	}
}
