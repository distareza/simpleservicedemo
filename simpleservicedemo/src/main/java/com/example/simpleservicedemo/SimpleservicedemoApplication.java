package com.example.simpleservicedemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleservicedemoApplication {

	@Value("${hello.name}")
	private String name;
	
	@RequestMapping("/")
	public String showRoot() {
		System.out.println("checking log here " + new Date());
		return "Hello " + name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleservicedemoApplication.class, args);
	}

}
