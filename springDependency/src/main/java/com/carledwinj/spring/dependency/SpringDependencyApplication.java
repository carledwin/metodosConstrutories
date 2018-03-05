package com.carledwinj.spring.dependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carledwinj.spring.dependency.service.ContaServiceImpl;

@SpringBootApplication
public class SpringDependencyApplication {
	
	private static Logger log = LoggerFactory.getLogger(ContaServiceImpl.class);

	public static void main(String[] args) {
		
		log.info("Executando SpringDependencyApplication.main()...");
		
		SpringApplication.run(SpringDependencyApplication.class, args);
	}
}
