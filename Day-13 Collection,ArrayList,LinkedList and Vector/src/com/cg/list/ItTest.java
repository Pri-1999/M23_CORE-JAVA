package com.cg.list;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
class Fruit
{
	public String name;
	//parameterized constructor
	public Fruit(String name)
	{
		super();
		this.name=name;
	}
}

public class ItTest {

	public static void main(String[] args) 
	{
		List<Fruit>obj=new ArrayList<Fruit>();
		Fruit f=new Fruit("Apple");
		obj.add(f);
		obj.add(new Fruit("Banana"));
		obj.add(new Fruit("DraggonFruit"));
		//To iterate the collections value
		Iterator<Fruit>i=obj.iterator();
		while(i.hasNext())
		{
			Fruit F2=i.next();
			System.out.println(F2.name);
		}
		
	}

}
