package com.developer.CrudSpringDocket;




import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.developer.CrudSpringDocket.models.Cartorio;

import com.developer.CrudSpringDocket.models.CartorioRepo;

@SpringBootApplication
public class CrudSpringDocketApplication implements CommandLineRunner{
	
	@Autowired
	private CartorioRepo cartorioRepo;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringDocketApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Cartorio ca1 = new Cartorio( 1,"Cartório de são paulo");
		Cartorio ca2 = new Cartorio( 2,"Cartório Santa Maria");
		Cartorio ca3 = new Cartorio( 3,"Cartório DIADEMA");
		Cartorio ca4 = new Cartorio( 4,"São Conrado");
		
		cartorioRepo.save(Arrays.asList(ca1,ca2,ca3,ca4));
		
	}

}
