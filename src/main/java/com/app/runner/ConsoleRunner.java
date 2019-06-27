package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Product(10,"A14D",1.0));
		repo.save(new Product(9,"A15E",2.0));
		repo.save(new Product(8,"A16F",3.0));
		repo.findAll().forEach(System.out::println);

	}

}
