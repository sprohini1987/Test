package com.payilagam.test;

public class StaticNonStatic {
	
	public static void getAdd(int a,int b){
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	public void getSub(){
		int a=20,b=25;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             StaticNonStatic.getAdd(10,20);
             StaticNonStatic d=new StaticNonStatic();
             d.getSub();
	}

}
