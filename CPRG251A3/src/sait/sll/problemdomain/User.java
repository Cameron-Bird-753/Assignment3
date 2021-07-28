package sait.sll.problemdomain;

import java.io.*;
/**
 * Represents a user.
 * @author Nick Hamnett
 * @version 2019-07-25
 *
 */
public class User implements Serializable{
	private int id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	/**
	 * Initializes a User object.
	 * @param id ID
	 * @param name Name
	 * @param email E-mail address
	 * @param password Password
	 */
	public User(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	/**
	 * Gets the users ID.
	 * @return Users ID
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Gets the users name.
	 * @return Name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Gets the users email.
	 * @return E-mail address.
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Checks if the passed password is correct.
	 * @param password Password to check.
	 * @return True if password is correct.
	 */
	public boolean isCorrectPassword(String password) {
		if (this.password == null && password == null)
			return true;
		else if (this.password == null || password == null)
			return false;
		else
			return this.password.equals(password);
	}
	
	/**
	 * Checks if object is equal to another object.
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof User))
			return false;
		
		User other = (User) obj;
		
		return this.id == other.id && this.name.equals(other.name) && this.email.equals(other.email);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	public final void writeObject(ObjectOutputStream oos) throws IOException
	{
		User user = new User(id, name, email, password);
		
		FileOutputStream fos = new FileOutputStream("User.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		
		oos.close();
		fos.close();
		
	}

	public final void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		User user = null;
		
		FileInputStream fis = new FileInputStream("User.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user2 = (User) ois.readObject();
		
		ois.close();
		fis.close();
		
		
	}
	
	
}
