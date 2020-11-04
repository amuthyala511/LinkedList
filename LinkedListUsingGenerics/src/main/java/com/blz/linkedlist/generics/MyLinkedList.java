package com.blz.linkedlist.generics;

public class MyLinkedList<K> {
	public static INode head;
	public static INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	//UC2 Adding Elements at the top
	public void add(INode<K> newNode) {
		if(this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		}
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	//UC3 Appending Elements
	public void appendElements(INode<K> newNode) {
		if(this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	//UC4 Adding Elements in between
	public void insertElements(INode<K> node, INode<K> newNode) {
		INode<K> tempNode = node.getNext();
		node.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	//UC5 Deleting First element
	public INode<K> deleteElement() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	//UC6 Deleting Last Element
	public INode<K> deleteLastElement() {
		INode<K> tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	//UC7 Search for a Particular Node
	public INode<K> searchNode(INode<K> keyNode) {
		INode<K> tempNode = this.head;
		while(!tempNode.getNext().equals(keyNode)) {
			tempNode = tempNode.getNext();
		}
		return keyNode;
	}
	
	//UC8 Search for a Particular Node and Insert new Element after that
	public void searchNodeAndInsert(INode<K> keyNode, INode<K> newNode)
	{
		INode<K> tempNode = this.head;
		while(!tempNode.getNext().equals(keyNode)) {
			tempNode = tempNode.getNext();
		}
		INode<K> newtempNode = keyNode.getNext();
		keyNode.setNext(newNode);
		newNode.setNext(newtempNode);
	}
	
	//UC9 Delete a specific Node and show size of the list
	public INode<K> deleteNodeInBetween(INode<K> keyNode) {
		INode node1 = this.head;
		INode tempNode = this.head;
		while(tempNode != keyNode) {
			tempNode = tempNode.getNext();
		}
		this.head = tempNode;
		deleteElement();
		INode node2 = this.head;
		this.head = node1;
		INode newtempNode = this.head;
		while(newtempNode.getNext() != keyNode) {
			newtempNode = newtempNode.getNext();
		}
		newtempNode.setNext(node2);
		return this.head;
	}
	
	public int myListSize() {
		int size = 0;
		if(this.head == null)
			return size;
		else
			size = 1;
		INode tempNode = this.head;
		while(tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}
}
