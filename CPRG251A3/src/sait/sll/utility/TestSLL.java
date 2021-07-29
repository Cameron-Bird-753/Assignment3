package sait.sll.utility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
		try {
			writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
    public static void writeObject(LinkedListADT list) throws IOException {
    	FileOutputStream file = new FileOutputStream("user.out");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(list);
        out.close();
        
    }
    
    public static void readObject(LinkedListADT list) throws IOException {
    try {
    	FileInputStream in = new FileInputStream("user.out");
        ObjectInputStream ois = new ObjectInputStream(in);
        list = (LinkedListADT)(ois.readObject());
      } catch (Exception e) {
        System.out.println("Problem serializing: " + e);
      }
    	((SLL) list).show();
    }
    

}
