package sait.sll.utility;

import java.io.Serializable;

public class Node implements Serializable {
	private Object data;
	private Node next; 
	
	public Node(Object data){
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Node getNode() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next; 
	}

	public Node getNext() {
		return next;
	}
	
	
	
}
