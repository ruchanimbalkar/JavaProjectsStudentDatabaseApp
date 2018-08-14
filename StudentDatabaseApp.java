/***
 * 
 * @author Rucha Nimbalkar
 *  Project 2 : Student Enrollment from Udemy
 *  			(Array of Objects)
 */
package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		/*
		Student student1 = new Student();
		student1.enroll();
		student1.payTuition();
		System.out.println(student1.toString());
		
		Student student2 = new Student();
		student2.enroll();
		student2.payTuition();
		System.out.println(student2.toString());
		
		Student student3 = new Student();
		student3.enroll();
		student3.payTuition();
		System.out.println(student3.toString());
		*/
		/*Multiple objects is not comfortable or good so we use array of objects*/
		
		//Ask how many new users we want to add
		System.out.println("Enter number of students to enroll : ");
		Scanner in = new Scanner (System.in);
	    int n = in.nextInt();
		
		//Create n no. of new students
	    Student students[] = new Student[n] ;
	    for(int i=0;i<n;i++){
	    	students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
	    	
	    }
	    
		for(int i =0 ;i<n;i++)
	    System.out.println("\n" +students[i].toString());
	}

}
