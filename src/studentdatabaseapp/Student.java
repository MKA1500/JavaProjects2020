package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Junior, \n2 - Mid Level, \n3 - Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
	}
	
	// Generate ID
	
	// Enroll in courses
	
	// View balance
	
	// Pay tuition
	
	// Show status
	
}
