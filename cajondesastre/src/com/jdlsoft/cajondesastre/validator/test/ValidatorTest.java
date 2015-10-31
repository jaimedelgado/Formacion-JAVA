package com.jdlsoft.cajondesastre.validator.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jdlsoft.cajondesastre.validator.Validator;

public class ValidatorTest {

	@Test
	public void validateLenTest(){		
		assertFalse(Validator.validateLen(null, 1, 5));
		assertFalse(Validator.validateLen("hola", -1, 5));
		assertFalse(Validator.validateLen("hola", 3, -1));
		assertFalse(Validator.validateLen("hola", 3, 1));
		assertTrue(Validator.validateLen("hola", 2, 5));
		assertFalse(Validator.validateLen("hola", 1, 3));
	}
	
	@Test
	public void validateDNITest(){
		assertFalse(Validator.validateDNI(null));
		assertFalse(Validator.validateDNI("651A"));
		assertFalse(Validator.validateDNI("5545615Ah"));
		assertFalse(Validator.validateDNI("F5684235X"));
		assertTrue(Validator.validateDNI("50242452X"));
		assertTrue(Validator.validateDNI("26254218V"));
		assertFalse(Validator.validateDNI("98765432."));
		assertFalse(Validator.validateDNI("50242452V"));
	}

}
