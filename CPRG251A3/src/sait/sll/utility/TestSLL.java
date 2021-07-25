package sait.sll.utility;

import sait.sll.problemdomain.User;

public class TestSLL {

	public static void main(String[] args) {
		User user1 = new User(1,"Cam1","cam@","hello");
		User user2 = new User(2,"Cam2","cam@","hello");
		User user3 = new User(3,"Cam3","cam@","hello");
		User user4 = new User(4,"Cam4","cam@","hello");
		User user5 = new User(5,"Cam5","cam@","hello");
		SLL list = new SLL();
		list.append(user1);
		list.append(user2);
		list.append(user3);
		list.append(user4);
		list.replace(user5, 0);
		System.out.println("Output" + list.retrieve(2).toString());
		System.out.println("Index is" + list.indexOf(user4));
		System.out.println("Size" + list.size());
		System.out.println("Contains" + list.contains(user3));
		System.out.println("sdfjkhgl");
		list.show();
		list.clear();
		list.show();

	}
}
