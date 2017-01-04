package com.payilagam.test;

public class Overload {

	public static void main(String[] args) {
		Overload a=new Overload();
		a.add(5,"rohini");
		a.add(4,6.5);
	}
	
	private void add(int d, double e) {
		System.out.println(d);
		System.out.println(e);
		
	}

	private void add(int i,String j) {
		System.out.println(i);
		System.out.println(j);
		
	}

}
