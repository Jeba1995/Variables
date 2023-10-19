package com.var;

public class LocalVariable {
	public void sample() {
		int a=10;
		System.out.println(a);
		System.out.println("Sample");
	}
	public static void main(String[] args) {
		LocalVariable l=new LocalVariable();
		l.sample();
	}
}
