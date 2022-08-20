package com.cg.collection;

import java.util.ArrayDeque;

public class DeQueueExample {

	public static void main(String[] args) 
	{
		ArrayDeque<String>deque=new ArrayDeque<String>();
		deque.add("Day");
		deque.addFirst("Each");
		deque.addLast("your");
		deque.addFirst("make");
		deque.add("masterpiece");
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		System.out.println(deque.peek());
	}

}
