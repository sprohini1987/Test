package com.payilagam.test;

public abstract class ReserveBank {
            
	public static void main(String[] args) {
		StateBank sbi=new StateBank(); 
		sbi.loan();
		StateBankOfHyd sbm=new StateBankOfHyd();
		sbm.deposit();
	}


}