package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Junior, \n2 - Mid Level, \n3 - Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	// Generate ID
	private void setStudentID() {
		// Grade level + ID
		// increments to all new instances, static belongs to class
		id++;
		this.studentID = gradeYear + "_" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		String course = "";
		
		do {
			System.out.println("Enter a course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				System.out.println("\nThank you for your choice.\n");
			}
		} while (!course.equals("Q"));
		
		System.out.println("ENROLL IN:\n" + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	// View balance
	
	// Pay tuition
	
	// Show status
	
}
