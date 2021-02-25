package oop.encapsulationhomework;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStID(101);
		st1.setStName("Nazifa Tasnia");
		st1.setStDOB("01-23-2008");
		st1.setStGrade("A+");
		
		System.out.println("Student ID: "+st1.getStID()+ ", Student Name: " 
				+ st1.getStName()+ ", Student DOB: " + st1.getStDOB()
				+ ", Student Gread: " + st1.getStGrade());

	}

}
