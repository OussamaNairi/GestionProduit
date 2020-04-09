package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.save(new Produit(null,"ordinateur HP",1900,5));
		produitRepository.save(new Produit(null,"Smartphone HP",2000,8));
		produitRepository.save(new Produit(null,"ordinateur DELL",1900,6));
		produitRepository.findAll().forEach(p->{
			
			System.out.println(p.toString());
		});
	}

}
