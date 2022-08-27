package com.cg.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Custom
{
	//Multi-value annotation
	String print() default"Priyanka";
	int speed() default 5;
	float percentage() default 88.8f;
}
class B
{
	@Custom (print="Hello Students",speed=50,percentage=88.8f)
	public void display()
	{
		System.out.println("Hurrah!It's Holoday");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws Exception
	{
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
	}

}
