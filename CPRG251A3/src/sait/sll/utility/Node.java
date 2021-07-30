package sait.sll.utility;

import java.io.Serializable;

/**
 * Used as the objects contained in the linked list, each node's reference
 * to the next node is stored as Next. Data contained in each variables is saved in the data variable
 * @author Cameron Bird
 */

public class Node implements Serializable {
	private Object data;
	private Node next; 
	
	/**
	 * public constructor 
	 * @param data of Object
	 */
	public Node(Object data){
		this.data = data;
	}
	
	/**
	 * Get's the data
	 * @return object's data
	 */
	public Object getData() {
		return data;
	}
	
	/**
	 * Sets the Data
	 * @param  data to be set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/**
	 * Set the next Node
	 * @param next node of object
	 */
	public void setNext(Node next) {
		this.next = next; 
	}

	/**
	 * get next Node
	 * @return next node 
	 */
	public Node getNext() {
		return next;
	}
}
