package Program1;

import java.util.Arrays;

public class SortElementsArray {

	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		System.out.println("Array before sorting:"+Arrays.toString(a));
       int n=a.length;
 for(int i=0; i<n-1;i++) {
	 for(int j=0;j<n-1;j++) {
		 if(a[j]>a[j+1]) {
			 int temp=a[i];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		 }
	 }
 }
	System.out.println("Array after sorting: "+Arrays.toString(a));	
	}

}
