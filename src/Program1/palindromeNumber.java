package Program1;

public class palindromeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner();
	System.out.println("enter a number:");
		
		int num=((Scanner .nextInt();
		
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(org_num==rev) {
			System.out.println(org_num+"palindrome number");
		}
		else {
			System.out.println(org_num+"not a palindrome number");
		}

	}

}
