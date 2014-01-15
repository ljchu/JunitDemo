package com.jango.ci.junitdemo;

public class JunitDemo {

	public boolean JunitDemoMethod1(int a, int b) {
		if (a>10||b<10) {
			return false;
		}else {
			return true;
		}
		
	}

	public int JunitDemoMethod2(int a, int b) {
		return a+b;
	}
	
	public void JunitDemoMethod3(int a) {
		while (a>0) {
			System.out.println("Dead loop.");
		}
	}
}
