package com.example;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyStack stack = new MyStack();

		String result = "";
		stack.push("hoge");
		stack.push("fuga");
		stack.push(1);

		int size = stack.size();
		for (int i = 0; i < size; i++) {
			result += stack.pop();
		}

		if (stack.isEmpty()) {
			System.out.println("result = " + result);
		} else {
			System.out.println("Can't because length is " + stack.size());
		}
	}
}
