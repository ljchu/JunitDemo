package com.jango.ci.junitdemo;

public class JunitDemoMain {

	public static void main(String[] args) {
		JunitDemo junitDemo = new JunitDemo();
		int a = 1;
		int b = 11;
		boolean c = junitDemo.JunitDemoMethod1(a, b);
		System.out.println(c);
	}

}
