package com.payilagam.test;

public class Const {

	public static void main(String[] args) {
		Const a=new Const();
		Const d=new Const("rohini", 467);
		
          
	}
	public Const(){
		System.out.println("hai");
	}
     public Const(String b,int c){
    	 System.out.println("Name "+b);
    	 System.out.println("Id "+c);
     }
}
