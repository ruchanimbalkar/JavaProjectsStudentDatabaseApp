package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	//private Scanner in =new Scanner (System.in);/*Not sure if this is a good idea*/
	private static int id =1000;
	//Constructor : prompt user to enter student name and year
	public Student(){
		
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.println(" Enter student first name : ");
		this.lastName = in.nextLine();
		
		System.out.println(" 1- Frehsmen \n 2- Sophomore \n 3 - Junior \n 4- Senior \n Enter student grade level : ");
		this.gradeYear = in.nextInt();
		
		System.out.println(gradeYear);
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	//Generate an ID
	private void setStudentID(){
		
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	
	//Enroll in courses
	public void enroll(){
		
		//Get inside loop, user hits Q to quit
		do {
			System.out.println("Enter course to enroll : (Q to quit)");
		    Scanner in = new Scanner(System.in);
		    String course = in.nextLine();
		    if(!course.equals("Q")){
		    	courses = courses + "\n" + course;
		    	tuitionBalance = tuitionBalance + costOfCourse;
			
		    }
		    else
		    	break;
		}    
		while(1!=0);    
		System.out.println("Enrolled in : " + courses);
		// Debugger statement System.out.println("Tuition Balance : " + tuitionBalance);
		
	}
	
	//View Balance
	public void viewBalance(){
		System.out.println("Your balance is : $" +tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition(){
		
		viewBalance(); /*Show student tuition balance */
		System.out.println("Enter payment amount : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thankyou for your payment of : $" +payment);
		viewBalance();
	}
	
	//Show Status
}
