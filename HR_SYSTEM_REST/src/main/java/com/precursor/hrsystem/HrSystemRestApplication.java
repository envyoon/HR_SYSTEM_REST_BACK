package com.precursor.hrsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@ComponentScan(basePackages = {"com.precursor.hrsystem.test.a03_mapper"})
public class HrSystemRestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HrSystemRestApplication.class, args);
	}
	
}
