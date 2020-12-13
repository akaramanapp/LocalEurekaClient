package com.eurekaclient.EurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaClientApplication {

	@RequestMapping("/product")
	public String getProduct() {
		return "Product endpoint";
	}

	@RequestMapping("/customer")
	public String getCustomer() {
		return "Customer endpoint";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
