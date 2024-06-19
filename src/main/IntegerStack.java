package main;

import java.util.Arrays;

public class IntegerStack {
	private int stack[];
	private int top;

	public IntegerStack(int SIZE) {
		stack = new int[SIZE];
		top = -1;
	}

	public void push(int i) {
		if (top == stack.length) {
			extendStack();
		}

		top++;
		stack[top] = i;

	}

	public int pop() {
		int temp = stack[top];
		top--;
		return temp;
	}

	public int peek() {
		return stack[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}

		return false;
	}

	private void extendStack() {
		int[] copy = Arrays.copyOf(stack, stack.length * 2);
	}

	public static void main(String[] args) {

		IntegerStack is = new IntegerStack(5);

		is.push(7);
		is.push(0);
		is.push(2);

		System.out.println("push " + is);

		is.pop();

		System.out.println("push " + is);

		is.push(3);

		System.out.println("push " + is);

		System.out.println("empty " + is.isEmpty());
		is.pop();
		is.pop();
		is.pop();
		System.out.println("empty " + is.isEmpty());

	}

	@Override
	public String toString() {
		return "IntegerStack [stack=" + Arrays.toString(stack) + "]";
	}

}