package com.learning.CacheTestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheTestProjectApplication.class, args);
	}

}
