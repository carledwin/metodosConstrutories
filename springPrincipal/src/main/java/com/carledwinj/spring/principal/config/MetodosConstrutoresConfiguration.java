package com.carledwinj.spring.principal.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carledwinj.spring.dependency.service.ContaService;
import com.carledwinj.spring.dependency.service.ContaServiceImpl;
import com.carledwinj.spring.principal.controller.ContaCorrenteRestController;

@Configuration
public class MetodosConstrutoresConfiguration {

	private static Logger log = LoggerFactory.getLogger(ContaCorrenteRestController.class);
	
	@Bean
	public ContaService contaServiceImpl() {
		
		log.info("Executando MetodosConstrutoresConfiguration.contaServiceImpl()..."); 
		
		return new ContaServiceImpl();
	}
	
}
