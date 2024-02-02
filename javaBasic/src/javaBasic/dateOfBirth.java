package javaBasic;

public class dateOfBirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birthYear = 1999;
		int currentYear = 2024;
		int yearlyMonth = 12;
		int birthMonth = 11;
		int currentMonth = 1;
		int birthDay = 4;
		int yearlyDay = 364;
		int age = currentYear - birthYear ;
		int ageDay = yearlyDay * age - birthDay;
		int ageMonth = age*yearlyMonth - birthMonth;
		System.out.println(age);       
		System.out.println(ageMonth);
		System.out.println(ageDay);
	}

}
