package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	

	//Each User should have a unique id and Username and Email
	
	@Id
	@GeneratedValue
	private long UserID;
	
	@Column(unique = true, nullable = false)
	private String userName;
	
	@Column(unique = true, nullable = false)
	private String emailAddress;
	
	//Those variables should not be unique
	private String firstName;
	private String lastName;

	

	public User(String userName, String firstName, String lastName, String emailAddress) {
		this.setUserName(userName);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAddress(emailAddress);
	}
	
	
	/*Get and Set of useID
	 * TODO: Remove those and put a serial function*/
	public User() {
	}
	
	public long getUserID() {
		return this.UserID;
	}
	
	public void setUserID(long userID) {
		UserID = userID;
	}
	//--------------------------------------^REMOVE^


	/**
	 * Get User's Username.
	 * @return String*/
	public String getUserName() {
		return this.userName;
	}
	

	/**Set User's Username
	 * @param String username to set*/
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	/**Get User's first name
	 * @return String*/
	public String getFirstName() {
		return this.firstName;
	}
	

	/**Set User's First name.
	 * @param String of first name to set*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	/**
	 * Get User's last name.
	 * @return String*/
	public String getLastName() {
		return this.lastName;
	}
	

	/**Set User's Last name
	 * @param String of last name to set*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Get User's Email address
	 * @return String*/
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	/**
	 * Set User's Email Address
	 * @param String of email to set*/
	public void setEmailAddress(String emailAddress) {
		this.emailAddress=emailAddress;
	}

	
}
