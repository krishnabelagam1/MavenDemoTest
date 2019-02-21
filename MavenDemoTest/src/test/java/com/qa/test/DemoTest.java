package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void add() {
		System.out.println("Additon");
		int a = 10, b = 30;
		Assert.assertEquals(40, a+b);
	}

	@Test
	public void sub() {
		System.out.println("Substraction");
		int a = 10, b = 30;
		Assert.assertEquals(20, b-a);
	}
	@Test
	public void mul() {
		System.out.println("Multiplication");
		int a = 10, b = 30;
		Assert.assertEquals(300, a*b);
	}
	@Test
	public void div() {
		System.out.println("Division");
		int a = 10, b = 30;
		Assert.assertEquals(3, b/a);
	}
	@Test
	public void mod() {
		System.out.println("Module");
		int a = 10, b = 30;
		Assert.assertEquals(0, b%a);
	}
}
