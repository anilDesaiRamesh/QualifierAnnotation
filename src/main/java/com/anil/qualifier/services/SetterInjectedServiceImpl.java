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
public class SetterInjectedServiceImpl implements GreetingService {

	public static final String PROPERTY_SERVICE = "Setter Injected Service Impl!!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.qualifier.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return PROPERTY_SERVICE;
	}

}
