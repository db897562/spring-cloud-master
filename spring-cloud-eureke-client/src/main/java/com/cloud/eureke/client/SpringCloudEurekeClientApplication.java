package com.cloud.eureke.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringCloudEurekeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekeClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/name")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am eureke-client from port:" +port;
	}
}
