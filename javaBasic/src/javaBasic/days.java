package javaBasic;

public class days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input total number of days and convert it into years, months, weeks, and days

		int days = 350;
		int weeks = days / 7;
		double months = (double)weeks /4;
		double years = (double) months / 12;
		System.out.println(weeks);
		System.out.println(months);
		System.out.println(years);
	}

}
