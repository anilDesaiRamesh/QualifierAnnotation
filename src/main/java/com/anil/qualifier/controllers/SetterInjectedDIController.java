/**
 * 
 */
package com.anil.qualifier.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.anil.qualifier.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class SetterInjectedDIController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterInjectedServiceImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
