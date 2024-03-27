package Program1;

public class palindromeNumber2 {

	public static void main(String[] args) {
		int rem ,sum =0,temp;
		int num=198781;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("palindrome Number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		
		
	}

}
