package com.nagarro.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {

	@GetMapping("/")
	public String demo(){
	return "hello world";

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
