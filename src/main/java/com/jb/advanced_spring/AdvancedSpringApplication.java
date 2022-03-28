package com.jb.advanced_spring;

import com.jb.advanced_spring.util.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvancedSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedSpringApplication.class, args);
		System.out.println(Art.banner);
	}

}
