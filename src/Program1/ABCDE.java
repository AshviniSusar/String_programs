package Program1;

public class ABCDE {

	public static void main(String[] args) {
		int n=4;
		int alpha=65;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
				
			}
			System.out.println(" ");
		}

	}

}
