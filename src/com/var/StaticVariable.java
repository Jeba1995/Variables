package com.var;

public class StaticVariable {
static int a;
public void sample() {
	System.out.println("sample");
}
public static void main(String[] args) {
	System.out.println(a);
	StaticVariable s=new StaticVariable();
	s.sample();
}
}
