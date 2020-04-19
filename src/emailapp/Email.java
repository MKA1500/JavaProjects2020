package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companyPrefix = "audi.eu";
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// generate password:
		this.password = generateRandomPassword(defaultPasswordLength);
		
		System.out.println("\nYour password is " + this.password);
		
		// combine elements to generate e-mail
		this.email = this.firstName.toLowerCase() + 
				"." + this.lastName.toLowerCase() + 
				"@" + this.department + "." + this.companyPrefix;
		
		System.out.println("\nYour email is " + this.email);
	}
	
	// ask for the department
	private String setDepartment() {
		System.out.println("Department codes:"
				+ "\n1 for Sales"
				+ "\n2 for Development"
				+ "\n3 for Accounting"
				+ "\n0 for none"
				+ "\nType department:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { 
			return "sales"; 
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acc";
		} else {
			return "";
		}
	}
	
	// generate a random password
	private String generateRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set the alternative email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL: " + email + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + " MB";
	}
}
