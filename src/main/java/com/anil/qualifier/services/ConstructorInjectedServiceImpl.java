/**
 * 
 */
package com.anil.qualifier.services;

import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
public class ConstructorInjectedServiceImpl implements GreetingService {

	public static final String CONSTRUCTOR_SERVICE = "Constructor injected Service Impl!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.qualifier.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return CONSTRUCTOR_SERVICE;
	}

}
