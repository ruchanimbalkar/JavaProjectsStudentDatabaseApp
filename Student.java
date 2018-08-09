package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private Scanner in;/* =new Scanner (System.in)*/;/*Not sure if this is a good idea*/
	private static int id =1000;
	//Constructor : prompt user to enter student name and year
	public Student(){
		in = new Scanner(System.in);
		System.out.println(" Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.println(" Enter student first name : ");
		this.lastName = in.nextLine();
		
		System.out.println(" 1- Frehsmen \n 2- Sophomore \n 3 - Junior \n 4- Senior \n Enter student grade level : ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + "" + studentID);
	}
	
	//Generate an ID
	private void setStudentID(){
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	
	//Enroll in courses
	
	//View Balance
	
	//Pay Tuition
	
	//Show Status
}
