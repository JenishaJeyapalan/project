package com.utest.UnitTest;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.utest.UnitTest1.Calculation;
import com.utest.UnitTest1.CalculationMaximum;

public class TestCase1 {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Run @BeforeClass....");
		
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Run @Before");
	}
	
	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27, Calculation.Cube(3));
	}
	
	@Test
	public void testArea() {
		System.out.println("test case cube");
		assertEquals(600, Calculation.Area(20,30));
	}
	
	@Test
	public void testmaXimum() {
		System.out.println("test case cube");
		assertEquals(8, CalculationMaximum.maxArray(new int[] {2,4,6,8,2}));
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Run @After");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Run @AfterClass");
	}
}
