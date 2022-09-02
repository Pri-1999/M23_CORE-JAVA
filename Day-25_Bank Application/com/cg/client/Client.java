package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(1001,"Priyanka Harde",11200, true);
		CurrentAcc n=new MMCurrentAcc(1002,"Dhanshri Katkade",16500, 50);
		System.out.println("Saving Account: ");
		p.withdraw(500);
		
		System.out.println("Current Account: ");
		n.withdraw(500);
		System.out.println(p);
		System.out.println(n);
	}
}