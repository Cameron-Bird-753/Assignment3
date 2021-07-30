package sait.sll.utility;

import java.io.Serializable;

/**
 * Single Linked List class, stores next object in list as Node, with for Object named as head.  
 * 
 * @author Cameron Bird
 *
 */
public class SLL implements LinkedListADT, Serializable{
	
	private static final long serialVersionUID = 1L;
	private Node head;
	

	@Override
	public boolean isEmpty() {
		return head == null ? true: false;
	}

	@Override
	public void clear() {
		head = null;
	}

	@Override
	public void append(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(null);
		
		if (head == null) { //List is empty
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) { //iterate from head
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	@Override
	public void prepend(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(head); //set the new nodes reference point (head will be next)
		head = newNode; //change to new node 
	}

	@Override
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
		Node newNode = new Node(data);
		
		if(index==0) {
			prepend(data);
		}
		else {
			/*Iterate from head	*/
			Node iteratorNode = head;
			
			for (int i = 0; i < index - 1; i++) {
				iteratorNode = iteratorNode.getNext(); //iterate from head
			}
			newNode.setNext(iteratorNode.getNext());
			iteratorNode.setNext(newNode);
		}
	}

	@Override
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
        Node tempNode = new Node(data);
		if (index == 0) {
			tempNode.setNext(head.getNext());
			head = tempNode;
        }
		
		else {
			Node cursor = head;
	        for (int i = 0; i < index - 1; i++) {
	        	cursor = cursor.getNext();
	        }
	
	        tempNode.setNext(cursor.getNext().getNext());
	        cursor.setNext(tempNode);
		}
		
	}

	@Override
	public int size() {
		
		if (head == null) {
			return 0;
		}
		else {
			Node iteratorNode = head;
			int count = 0;
			while (iteratorNode.getNext() != null) { //iterate from head
				iteratorNode = iteratorNode.getNext();
				count++;
		}
			return count + 1;
		}
	}

	@Override
	public void delete(int index) throws IndexOutOfBoundsException {
		if (index == 0) {
			
			head = head.getNext();
		} else {
			/*Iterate from head	*/
			Node iteratorNode = head;
			Node tempNode = null;
			
			for (int i = 0; i < index - 1; i++) {
				iteratorNode = iteratorNode.getNext(); //iterator to next node
			}
			tempNode = iteratorNode.getNext();
			iteratorNode.setNext(tempNode.getNext());
			tempNode = null;
		}
	}

	@Override
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		Node iteratorNode = head;
		for (int i = 0; i < index; i++) {
			iteratorNode = iteratorNode.getNext(); //iterator to next node
		}
		return iteratorNode.getData();
	}
	
	

	@Override
	public int indexOf(Object data) {
		Node iteratorNode = head;
		int count =0;
		while (iteratorNode.getNext() != null) { //iterate from head
			if (iteratorNode.getData().equals(data)) {
				return count;			
			}
			iteratorNode = iteratorNode.getNext();
			count++;
	}
		return 0;
	}

	@Override
	public boolean contains(Object data) {
		Node iteratorNode = head;
		int count =0;
		while (iteratorNode.getNext() != null) { //iterate from head
			if (iteratorNode.getData().equals(data)) {
				return true;			
			}
			iteratorNode = iteratorNode.getNext();
			count++;
	}
		return false;
	}
	
	public void show() {
		try {
			Node tempNode = head; 
			
			while (tempNode.getNext() != null) {
				System.out.println(tempNode.getData().toString());
				tempNode = tempNode.getNext();
			}
			System.out.println(tempNode.getData().toString());
			
		} catch (NullPointerException ex) {
			System.out.println("List is empty");
		}
		}
}
