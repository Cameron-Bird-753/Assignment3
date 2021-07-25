package sait.sll.utility;

public class SLL implements LinkedListADT
{
	private Node head;
	private Node tail;
	private Node current;
	private Node temp;
	private Node previous;
	
	private int length = 0;

	
	public SLL() 
	{
		head = tail = null;
	}

	public Node getHead() 
	{
		return head;
	}

	public Node getTail() {
		return tail;
	}
	
	public Node getCurrent() {
		return current;
	}

	public void setCurrent(Node current) {
		this.current = current;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	

	public void append(Object data) 
	{
		if(!isEmpty()) 
		{
			tail.setNext(new Node(data));
			tail = tail.getNext();
		}
		else 
		{
			head = tail = new Node(data);
		}
		length++;	
	}
	
	public void prepend(Object data)
	
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		length++;
		
		if(tail == null)
			tail = head;
	}
	
	public void indexOf(int index, Object data)
	{
		if (index == 0)
		{
			prepend(data);
		}
		else if (index >= length)
		{
			append(data);
		}
		
		else
		{
			Node current = head;
			for(int i = 1; i < index; i++)
			{
				current = current.next;
			}
			Node temp = current.next;
			current.next = new Node(data);
			(current.next).next = temp;
			length++;
		}
	}
	
		public Node removeFirst()
		{
			if(length == 0)
			{
				return null;
			}
			else 
			 temp = (Node) head.getElement();
			 head = head.next;
			length--;
			if (head == null)
			{
				tail = null;
			}
			return temp;
		}

		
		public Node removeLast()
		{
			if (length == 0 || length == 1)
			{
				return removeFirst();
			}
			else
			{
				Node current = head;
				for (int i = 0; i < length - 2; i++)
				{
					current = current.next;
				}
				
				Node temp = (Node) tail.getElement();
				tail = current;
				tail.next = null;
				length--;
				return temp;
			}
		}
		
		
		public Node remove(int index)
		{
			if(index < 0 || index >= length)
			{
				return null;
			}
			else if(index == 0)
			{
				return removeFirst();
			}
			else if(index == length - 1)
			{
				return removeLast();
			}
			else
			{
				Node previous = head;
				
				for (int i = 1; i < index; i++)
				{
					previous = previous.next;
				}
				
				Node current = previous.next;
				previous.next = current.next;
				length--;
				return (Node) current.getElement();
			}
		
		
	}


	@Override
	public void append(Object data, int index) throws IndexOutOfBoundsException 
	{
		
	}

	@Override
	public void prepend(Object data) 
	{
		
	}

	@Override
	public void set(Object data, int index) throws IndexOutOfBoundsException 
	{
		
	}

	@Override
	public int size() 
	{
		return length;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException 
	{
		return null;
	}

	@Override
	public int indexOf(Object data) 
	{
		return 0;
	}

	@Override
	public boolean contains(Object data) 
	{
		return false;
	}

	@Override
	public boolean isEmpty()
	{	
		return (head == null);
	}

	@Override
	public void clear() 
	{
		length = 0;
		head = tail = null;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException 
	{
		
	}
	
	public void print() {
		for(Node temp = head; temp != null; temp = temp.getNext()) 
		{
			System.out.println(temp.getElement().toString());
		}
	}

	@Override
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		/*
		SLL sll = new SLL();
		sll.append("a");
		sll.append("b");
		sll.append("c");
		sll.append("d");
		
		sll.print();
		
		
		sll.prepend("a");
		sll.prepend("b");
		sll.prepend("c");
		sll.prepend("d");
		
		sll.print();
		*/

	}

}
	

	


