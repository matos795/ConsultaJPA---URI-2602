package com.devsuperior.uri2602;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2602.dto.CustomerMinDTO;
import com.devsuperior.uri2602.dto.ProductDTO;
import com.devsuperior.uri2602.projections.CustomerMinProjection;
import com.devsuperior.uri2602.projections.ProductMinProjection;
import com.devsuperior.uri2602.repositories.CustomerRepository;
import com.devsuperior.uri2602.repositories.ProductRepository;

@SpringBootApplication
public class Uri2602Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("--------------------- S Q L ---------------------");

		List<CustomerMinProjection> list2603 = customerRepository.search2603("Porto Alegre");
		List<CustomerMinDTO> dtoList2603 = list2603.stream().map(x -> new CustomerMinDTO(x)).collect(Collectors.toList());
		for (CustomerMinDTO obj : dtoList2603) {
			System.out.println(obj);
		}

		List<ProductMinProjection> list2604 = productRepository.search2604(10, 100);
		List<ProductDTO> dtoList2604 = list2604.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		for (ProductDTO obj : dtoList2604) {
			System.out.println(obj);
		}

		System.out.println("--------------------- J P Q L ---------------------");

		List<CustomerMinDTO> list2 = customerRepository.search2603X("Porto Alegre");
		for (CustomerMinDTO obj : list2) {
			System.out.println(obj);
		}

		List<ProductDTO> list2604X = productRepository.search2604X(10, 100);
		for (ProductDTO obj : list2604X) {
			System.out.println(obj);
		}

		System.out.println("------------------------------------------");
	}
}
