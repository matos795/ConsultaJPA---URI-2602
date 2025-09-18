package com.devsuperior.uri2602;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2602.dto.CustomerMinDTO;
import com.devsuperior.uri2602.projections.CustomerMinProjection;
import com.devsuperior.uri2602.repositories.CustomerRepository;

@SpringBootApplication
public class Uri2602Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("--------------------- S Q L ---------------------");

		List<CustomerMinProjection> list = customerRepository.search2603("Porto Alegre");
		List<CustomerMinDTO> dtoList = list.stream().map(x -> new CustomerMinDTO(x)).collect(Collectors.toList());
		for (CustomerMinDTO obj : dtoList) {
			System.out.println(obj);
		}

		System.out.println("--------------------- J P Q L ---------------------");

		List<CustomerMinDTO> list2 = customerRepository.search2603X("Porto Alegre");
		for (CustomerMinDTO obj : list2) {
			System.out.println(obj);
		}

		System.out.println("------------------------------------------");
	}
}
