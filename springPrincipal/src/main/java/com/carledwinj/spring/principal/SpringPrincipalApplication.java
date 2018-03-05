package com.carledwinj.spring.principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carledwinj.spring.principal.controller.ContaCorrenteRestController;

@SpringBootApplication
public class SpringPrincipalApplication {

	private static Logger log = LoggerFactory.getLogger(ContaCorrenteRestController.class);
	
	public static void main(String[] args) {
		
		log.info("Executando SpringPrincipalApplication.main()..."); 
		
		SpringApplication.run(SpringPrincipalApplication.class, args);
	}
}
