package com.payilagam.test;

public class Customer extends Bank {

		public void getcustomerdetails() {
		   
			System.out.println("Name : Rohini");
			System.out.println("Mob No:8972468902");
		}

		protected void getloan() {
		int interest=(((200000*12)/100)/36);
			System.out.println("Interest for loan="+interest);
			
		}
		private void getCar(){
			System.out.println("Buy car this year");
		}

		 void giveloanforCar() {
			// TODO Auto-generated method stub
			int carinterest=((150000*9)/100)/24;
			System.out.println("interest for car loan= "+carinterest);
		}
}
