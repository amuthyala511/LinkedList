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
}
