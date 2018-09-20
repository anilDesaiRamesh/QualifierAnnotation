package com.anil.qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.qualifier.controllers.ConstructorInjectedDIController;
import com.anil.qualifier.controllers.PropertyInjectedController;
import com.anil.qualifier.controllers.SetterInjectedDIController;

@SpringBootApplication
public class QualifierAnnotationSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(QualifierAnnotationSpringApplication.class, args);
				
		System.out.println("Property Injected : " + run.getBean(PropertyInjectedController.class).sayHello());
		System.out.println("Setter Injected : " + run.getBean(SetterInjectedDIController.class).sayHello());
		System.out.println("Constructor Injected : " + run.getBean(ConstructorInjectedDIController.class).sayHello());
	}
}
