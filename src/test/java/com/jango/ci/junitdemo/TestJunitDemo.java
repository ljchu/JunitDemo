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
	public void testJunitDemoMethod1() {
		JunitDemo junitDemo = new JunitDemo();
		int a = 1,b=11;
		boolean result = junitDemo.JunitDemoMethod1(a,b);
		boolean exp = true;
		assertSame(exp, result);
	}

}
