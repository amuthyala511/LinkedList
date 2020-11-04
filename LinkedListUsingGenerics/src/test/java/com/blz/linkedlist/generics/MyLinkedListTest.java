package com.blz.linkedlist.generics;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	
	//UC2 Adding elements at the top
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
	
	//UC3 Appending elements at the last
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
	
	//UC4 Adding elements in between 
	@Test
	public void given3Numbers_addInBetween() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.add(myFirstNode);
		myList.appendElements(myThirdNode);
		myList.insertElements(myFirstNode, mySecondNode);
		boolean result = MyLinkedList.head.equals(myFirstNode) &&
					MyLinkedList.head.getNext().equals(mySecondNode) && 
					MyLinkedList.tail.equals(myThirdNode);
		Assert.assertEquals(true, result);
	}
	
	//UC5 Deleting First Element
	@Test
	public void given3Numbers_deleteFirstElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.appendElements(myFirstNode);
		myList.appendElements(mySecondNode);
		myList.appendElements(myThirdNode);
		myList.deleteElement();
		boolean result = MyLinkedList.head.equals(mySecondNode);
		Assert.assertEquals(true, result);
	}
	
	//UC6 Deleting Last Element
	@Test
	public void given3Numbers_deleteLastElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.appendElements(myFirstNode);
		myList.appendElements(mySecondNode);
		myList.appendElements(myThirdNode);
		myList.deleteLastElement();
		INode result = myList.deleteLastElement();
		Assert.assertEquals(mySecondNode, result);
	}
	
	//UC7 Searching for a specific Node in the List
	public void given3Numbers_searchSpecificNode() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.appendElements(myFirstNode);
		myList.appendElements(mySecondNode);
		myList.appendElements(myThirdNode);
		INode result = myList.searchNode(mySecondNode);
		Assert.assertEquals(mySecondNode, result);
	}
}
