package com.var;

public class InstanceVariable {
	public int a;
	public void sample() {
		System.out.println(a);
		System.out.println("Sample");
	}
	public static void main(String[] args) {
		InstanceVariable l=new InstanceVariable();
		l.sample();
	}
}
