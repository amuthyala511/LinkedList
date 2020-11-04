package com.blz.linkedlist.generics;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void given3Numbers_appendAtTheLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.appendElements(myFirstNode);
		myList.appendElements(mySecondNode);
		myList.appendElements(myThirdNode);
		boolean result = MyLinkedList.head.equals(myFirstNode) &&
					MyLinkedList.head.getNext().equals(mySecondNode) && 
					MyLinkedList.tail.equals(myThirdNode);
		Assert.assertEquals(true, result);
	}
}
