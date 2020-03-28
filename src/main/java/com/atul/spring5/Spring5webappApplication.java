package com.atul.spring5;

import com.atul.spring5.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.atul.spring5"})
public class Spring5webappApplication {

	public static void main(String[] args) {
		final ApplicationContext context = SpringApplication.run(Spring5webappApplication.class, args);
		final MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.testData());;
		System.out.println("App is up and running");
	}

}
