package com.android.obhcalculator;

public class SingularlyLinkedList<E> {
	// ---------------- nested Node class ----------------
	private static class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	} // ----------- end of nested Node class -----------

	// instance variables of the SinglyLinkedList
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	// constructs an initially empty list
	public SingularlyLinkedList() {
	}

	// access methods

	// should return size or number of nodes in the list
	// without using 'size' attribute/variable
	// hint: use a loop until it reaches null

	// Exercise R-3.6
	public E getSecondToTheLast() {
		E secondToTheLast = null;
		Node<E> n = head;
		for (int i = 0; i < size - 1; i++) {
			secondToTheLast = (E) n.getElement();
			// System.out.println(secondToTheLast);
			n = n.getNext();
		}

		return secondToTheLast;
	}

	// Exercise R-3.9
	public int size() {
		int count = 0;
		for (Node<E> n = head; n != null; n = n.getNext()) {
			count++;
		}
		return count;
	}

	// Exercise R-3.12
	public void rotate() {
		addLast(removeFirst());
	}

	// Creativity C-3.25
	public void concatenate(SingularlyLinkedList<E> list2) {
		int list2Size = list2.size();
		for (int i = 1; i <= list2Size; i++) {
			addLast(list2.removeFirst());
		}
	}

	// Creativity C-3.26
	/*public void concatenate(DoublyLinkedList<E> list2) {
		int list2Size = list2.size();
		for (int i = 1; i <= list2Size; i++) {
			addLast(list2.removeFirst());
		}
	}*/

	// Creativity C-3.28
	public void reverse() {
		if (isEmpty())
			return;
		
		Node<E> lastInsertedNode = new Node<E>(first(), null);
		tail = lastInsertedNode;
		for (Node<E> n = head.getNext(); n != null; n = n.getNext()) {
			Node<E> node = new Node<E>(n.getElement(), lastInsertedNode);
			lastInsertedNode = node;
		}
		head = lastInsertedNode;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public void addLast(E e) {
		Node<E> newest = new Node<E>(e, null);
		if (isEmpty()) // false
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}
}