package basic;

public class Student {

	String name;
	String rollNo;
	int totalMarks;

	Student(String nameAndRollNo[], int marks[]) {

		name = nameAndRollNo[0];
		rollNo = nameAndRollNo[1];
		for (int i = 0; i < marks.length; i++) {
			totalMarks = marks[i] + totalMarks;
		}

	}

	Student(String nameAndRollNo[], int marks[], int num) {

	}

	void studentDetials() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(totalMarks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameAndRollNo = { "sam ", "ra2432" };
		int marks[] = { 65, 75, 94, 83, 93 };
		Student detials = new Student(nameAndRollNo, marks);
		detials.studentDetials();

		String[] nameAndRollNo2 = { "revanth ", "ra4352" };
		int marks2[] = { 65, 75, 54, 83, 53 };
		Student detials2 = new Student(nameAndRollNo2, marks2);
		detials2.studentDetials();

	}

}
