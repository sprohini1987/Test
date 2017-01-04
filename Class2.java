package com.payilagam.test;

public class Class2 extends Class1 {
	public void getMul(){
		int a=25,b=100,c;
		c=a*b;
		System.out.println("mul="+c);
	}

	public static void main(String[] args) {
		Class1 d=new Class2();
		d.getMul();

	}

}
