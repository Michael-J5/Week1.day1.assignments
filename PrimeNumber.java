package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int Input = 9;
		boolean Flag = false;
		for (int i = 2; i < Input / 2; i++) {

			if (Input % i == 0) {
				Flag = true;
			}

		}
		if (Flag == false) {
			System.out.println(Input + " is a Prime Number");
		} else {
			System.out.println(Input + " is Not a Prime Number");
		}
	}

}
