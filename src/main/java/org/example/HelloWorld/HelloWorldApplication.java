package org.example.HelloWorld;

import org.example.HelloWorld.Components.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

		SpringApplication springApplication= new SpringApplication(HelloWorldApplication.class);
		ConfigurableApplicationContext container = springApplication.run();

		//student
		Student student = container.getBean(Student.class);
		System.out.println(student);
		System.out.println(student.getName());

		//myApp
		myApp m = container.getBean(myApp.class);
		System.out.println(m.getName());
		logger.info("Checking Thymeleaf Configuration...");

        logger.info("✅ Thymeleaf is available.");
		if (SpringTemplateEngine.class != null) {
			logger.info("✅ Thymeleaf is available.");
		} else {
			logger.error("❌ Thymeleaf NOT found.");
		}
    }
}
