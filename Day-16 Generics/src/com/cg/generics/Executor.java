package com.cg.generics;

public class Executor {

	public static void main(String[] args) 
	{
		//Create a Sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		System.out.println();
		//Create an email object to be send using sender
		Email em=new Email();
		em.setFrom("hardepriyanka0@gmail.com");
		em.setTo("skumbhalkar@tnsif.org");
		em.setSubject("Java Full Stack");
		em.setBody("About Traning And Placements ");
		System.out.println(em.getBody());
		//create a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		obj1.sendMessage();
	}

}
