package com.cg.list;

import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Address
{
	private int plotNo;
	private String Street;
	@SuppressWarnings("unused")
	private String Area;
	private String City;
	@SuppressWarnings("unused")
	private String state;
	public Address(int plotNo,String Street,String Area,String City,String state)
	{
		super();
		this.plotNo=plotNo;
		this.Street=Street;
		this.Area=Area;
		this.City=City;
		this.state=state;
	}
	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", Street=" + Street + ", Area=" + Area + ", City=" + City + ", state="
				+ state + "]";
	}
	
}

public class MailList {

	public static void main(String[] args) 
	{
		List<Address>obj=new LinkedList<>();
		//add elements to the link list
		obj.add(new Address(121, "Lane No:2","Airoli","Mumbai","Maharashtra"));
		obj.add(new Address(531, "Lane No:3","Hinjewadi","Pune","Maharashtra"));
		java.util.Iterator<Address> i=obj.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			System.out.println(element+"\n");
		}
		System.out.println();
		
	}

}
