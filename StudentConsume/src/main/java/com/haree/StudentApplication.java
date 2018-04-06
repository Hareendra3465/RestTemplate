package com.haree;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.haree.controller.StudentController;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				StudentApplication.class, args);
		
		StudentController consumer=ctx.getBean(StudentController.class);
		System.out.println(consumer);
		consumer.getStudent();
		
	}
	
	@Bean
	public  StudentController  consumerControllerClient()
	{
		return  new StudentController();
	}
}