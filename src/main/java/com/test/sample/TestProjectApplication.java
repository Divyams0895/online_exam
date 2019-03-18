package com.test.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestProjectApplication {

	@GetMapping("/")
public String welcome() {
	return "welcome to github";
}
	
	@GetMapping("/{input}")
	public String congrtas(@PathVariable String input) {
		return "hi "+input+ "has been deployed successfully..........";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
