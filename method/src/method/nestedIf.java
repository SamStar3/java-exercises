package method;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 1000;
		int bonus = 100;
		if (bonus < score && score <1000 ) {
			System.out.println("it's normal");
		}else if (bonus <200){
			System.out.println("it's low bonus ");
		}else {
			System.out.println("got here");
		}

	}

}
