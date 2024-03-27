package Program1;

public class findMisssingNumberArray {
public static void main(String args[]) {
	int a[]= {10,20,40,50};
	int Search_ele =20;
	boolean flag=false;
	
	for(int i=0;i<=a.length;i++) {
		
		if(Search_ele ==a[i]) {
			System.out.println("Element found at :"+i);
			break;
		}
		
		}
	if(flag==true) {
		System.out.println("Element not found");
	}
	
}
}
