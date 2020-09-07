package com.sapient.training.ui.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatotTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isValidtestaddition() {
		Calculatot c = new Calculatot();
		assertEquals("test passed",5.0,c.addition(2.0,3.0),0.01);
	}
	@Test
	public void isInValidtestaddition() {
		Calculatot c = new Calculatot();
		assertEquals("test passed",4.0,c.addition(2.0,3.0),0.01);
	}
	@Test
	public void isValidtestsubstraction() {
		Calculatot c = new Calculatot();
		assertEquals("test passed",5,c.substraction(10,5),0);
	}
	@Test
	public void isInValidtestsubstraction() {
		Calculatot c = new Calculatot();
		assertEquals("test passed",5,c.substraction(9,3),0);
	}

}
