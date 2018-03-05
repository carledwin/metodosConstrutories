package com.carledwinj.spring.dependency.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.carledwinj.spring.dependency.model.ContaCorrente;

public class ContaServiceImpl implements ContaService {

	private static Logger log = LoggerFactory.getLogger(ContaServiceImpl.class);
	
	@Override
	public List<ContaCorrente> todas() {
		
		log.info("Executando ContaServiceImpl.todas()..."); 
		
		List<ContaCorrente> list = new ArrayList<>();
		list.add(new ContaCorrente(123, 353434, 3));
		list.add(new ContaCorrente(6756, 97867666, 9));
		return list;
	}

}
