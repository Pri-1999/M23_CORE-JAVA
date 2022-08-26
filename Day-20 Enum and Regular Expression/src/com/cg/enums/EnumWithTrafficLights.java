package com.cg.enums;
enum TrafficLight
{
	RED(30),YELLOW(10),GREEN(40);
	private final int seconds;
	//constructor
	private TrafficLight(int seconds)
	{
		this.seconds = seconds;
	}
	//getter method only because we use constructor to set the values
	public int getSeconds() {
		return seconds;
	}
}

public class EnumWithTrafficLights {

	public static void main(String[] args) 
	{
		for(TrafficLight i:TrafficLight.values())
		{
			System.out.printf("%s: %d seconds\n",i,i.getSeconds());
		}
		
	}

}
