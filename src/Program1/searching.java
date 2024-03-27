package Program1;

public class searching {

	public static void main(String[] args) {
		int a[]= {12,23,44,35,55};
		int search_ele=44;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("element found is:"+i);
				flag=true;
				break;
			}
			
			
		}
		if(flag==false);
		System.out.println("elemnt not found");
		
		
	}

}
