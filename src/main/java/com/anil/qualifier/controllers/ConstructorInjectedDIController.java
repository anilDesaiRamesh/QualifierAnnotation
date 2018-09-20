/**
 * 
 */
package com.anil.qualifier.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.anil.qualifier.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class ConstructorInjectedDIController {

	private GreetingService greetingService;

	/*
	 * For constructor based DI Injection @Autowired is not required framework will
	 * default it
	 */
	public ConstructorInjectedDIController(@Qualifier("constructorInjectedServiceImpl") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
