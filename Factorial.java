package week1.day1.assignments;

public class Factorial {
	public static void main(String[] args) {
		int Input = 5;
		int Fact = 1;
		for (int i = 1; i <= Input; i++) {
			Fact = Fact * i;
		}
		System.out.println(Fact);
	}
}
