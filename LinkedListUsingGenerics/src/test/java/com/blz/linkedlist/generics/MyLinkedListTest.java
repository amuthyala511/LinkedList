package com.blz.linkedlist.generics;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void given3Numbers_addAtTheTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.add(myFirstNode);
		myList.add(mySecondNode);
		myList.add(myThirdNode);
		boolean result = MyLinkedList.head.equals(myThirdNode) &&
					MyLinkedList.head.getNext().equals(mySecondNode) && 
					MyLinkedList.tail.equals(myFirstNode);
		Assert.assertEquals(true, result);
	}
}
