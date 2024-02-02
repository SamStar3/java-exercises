package javaBasic;

public class totalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input 5 subject marks of a student and find total marks and percentage obtained by the student.
		int english = 69;
		int tamil = 79;
		int maths = 86;
		int science = 92;
		int social = 98;
		 
		int totalMarks = english + tamil + maths + science + social;
		int totalPrecentage = totalMarks / 5;
		System.out.println(totalMarks);
		System.out.println(totalPrecentage);
		

	}

}
