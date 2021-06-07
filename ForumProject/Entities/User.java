package Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{
	


	private static final long serialVersionUID = 1L;

	//Each User should have a unique id and Username and Email
	
	@Id
	@GeneratedValue
	private long UserID;
	
	@Column(unique = true, nullable = false, length = 15)
	private String userName;
	
	@Column(unique = true, nullable = false, length = 60)
	private String emailAddress;
	
	//Those variables should not be unique
	@Column(nullable = false, length = 60)
	private String password;
	@Column(nullable = true, length = 15)
	private String firstName;
	@Column(nullable = true, length = 15)
	private String lastName;
	boolean isBlocked = false;
	

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

	/**
	 * Set User's password.
	 * @param String password to set*/
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Get User's password
	 * @return String*/
	public String getPassword() {
		return this.password;
		
	}
	
	
}
