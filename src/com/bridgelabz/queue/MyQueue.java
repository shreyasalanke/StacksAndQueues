package com.bridgelabz.queue;

public class MyQueue {
	MyNode head;
	MyNode tail;
	public void enQueue (int data) {
		MyNode newNode = new MyNode();
		newNode.setData(data);
		newNode.setNext(head);
		
		if (head == null) {
			head =newNode;
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
	}
	
}

