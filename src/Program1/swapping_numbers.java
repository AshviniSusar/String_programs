package Program1;

public class swapping_numbers {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int temp;

		System.out.println("before swaping numbers: " + n1 + "," + n2);

		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("after swapping the numbers: " + n1 + "," + n2);

	}
}
