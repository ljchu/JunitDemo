package com.jango.ci.junitdemo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunitDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start testing.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Finished testing.");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJunitDemoMethod1() {
		JunitDemo junitDemo = new JunitDemo();
		int a = 1,b=11;
		boolean result = junitDemo.JunitDemoMethod1(a,b);
		boolean exp = true;
		assertSame(exp, result);
	}
	
	@Test
	public void testJunitDemoMethod2(){
		System.out.println("Test add.");
		JunitDemo junitDemo = new JunitDemo();
		int a = 1,b=11;
		int result = junitDemo.JunitDemoMethod2(a,b);
		int exp = 12;
		assertSame(exp, result);
	}
	
	@Test
	public void testJunitDemoMethod1_2(){
		JunitDemo junitDemo = new JunitDemo();
		int a = 1,b=8;
		boolean result = junitDemo.JunitDemoMethod1(a,b);
		boolean exp = false;
		assertSame(exp, result);
	}
	@Test
	public void testJunitDemoMethod1_3(){
		JunitDemo junitDemo = new JunitDemo();
		int a = 11,b=8;
		boolean result = junitDemo.JunitDemoMethod1(a,b);
		boolean exp = false;
		assertSame(exp, result);
	}
	
	@Test
	public void testJunitDemoMethod3(){
		JunitDemo junitDemo = new JunitDemo();
		int a = 5;
		junitDemo.JunitDemoMethod3(a);
		assertTrue(true);
	}
}
