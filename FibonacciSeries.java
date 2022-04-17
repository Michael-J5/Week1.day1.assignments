package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int Range = 6;
		int FirstNum = 0;
		int SecNum = 1;
		
		System.out.println(FirstNum);
		System.out.println(SecNum);
		for (int i = 0; i < Range; i++) {

			int Sum = FirstNum + SecNum;
			FirstNum = SecNum;
			SecNum = Sum;
			System.out.println(Sum);

		}

	}

}
