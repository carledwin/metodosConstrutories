package com.carledwinj.spring.principal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinj.spring.dependency.model.ContaCorrente;
import com.carledwinj.spring.dependency.service.ContaService;


@RestController
public class ContaCorrenteRestController {
	
	private static Logger log = LoggerFactory.getLogger(ContaCorrenteRestController.class);
	
	@Autowired
	private ContaService service;
	
	@GetMapping("/contas")
	public List<ContaCorrente> todas(){
		
		log.info("Executando ContaCorrenteRestController.todas()..."); 
		
		return service.todas();
	}

}
