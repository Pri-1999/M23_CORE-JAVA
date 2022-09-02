package com.cg.client;

import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;

import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client 
{
	public static void main(String[] args)
	{
		//here minimum account balance limit is 500 
		SavingAcc   ms= new MMSavingAcc(1001,"Priyanka Harde",400, true);		
		//current limit is 2500 
		CurrentAcc mc= new MMCurrentAcc(1002,"Suvarna Harde",5000,2500);	
		System.out.println("Saving Account : ");
		ms.withdraw(100);
		
		System.out.println("Current Account : ");
		mc.withdraw(3000);		
	}	
}