package com.shiyajian.project;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectProviderApplication.class, args);
	}
}
