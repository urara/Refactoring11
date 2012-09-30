package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {

	MyStack stack = new MyStack();

	@Test
	public void pushTest() {
		assertEquals(stack.size(), 0);
		stack.push(1);
		assertEquals(stack.size(), 1);
	}

	@Test
	public void popTest() {
		stack.push(2);
		System.out.println(stack.size());
		assertEquals(stack.pop(), 2);
	}
}
