/**
 * 
 */
package com.anil.qualifier.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anil.qualifier.services.GreetingService;
import com.anil.qualifier.services.GreetingServiceImpl;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
