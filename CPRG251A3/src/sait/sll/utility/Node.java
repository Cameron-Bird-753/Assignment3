package sait.sll.utility;

import java.io.Serializable;

/**
 * Used as the objects contained in the linked list, each node's reference
 * to the next node is stored as Next. Data contained in each variables is saved in the data variable
 * @author Cameron Bird
 *
 */
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
	
	public void setNext(Node next) {
		this.next = next; 
	}

	public Node getNext() {
		return next;
	}
}
