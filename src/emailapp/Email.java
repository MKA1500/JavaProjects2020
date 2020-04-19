package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength;
	private String alternateEmail;
	private String companyPrefix;
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.defaultPasswordLength = 8;
		this.companyPrefix = "audi.eu";
		
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
	
	// set the alternative email
}
