package com.payilagam.test;

public class Customer extends Bank {

		public void getcustomerdetails() {
		   
			System.out.println("Name : Rohini");
			System.out.println("Mob No:8972468902");
		}

		public void getloan() {
		int interest=(((200000*12)/100)/36);
			System.out.println("Interest for loan="+interest);
			
		}
}
