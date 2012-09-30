package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {

	MyStack stack = new MyStack();

	@Test
	public void pushTest() {
		stack.push(1);
		assertEquals(stack.elementAt(0), 1);
	}

	@Test
	public void popTest() {
		stack.push(2);
		// System.out.println(stack.pop());
		assertEquals(stack.pop(), 2);
	}
}
