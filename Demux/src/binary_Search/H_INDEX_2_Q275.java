package binary_Search;

import java.util.Scanner;

public class H_INDEX_2_Q275 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		
		}
		
		// First T
		// F*T*
		// P(x)=
	
       int low=0, high=arr.length-1;
       while(low<=high)
       {
    	   int mid=low+(high-low)/2;
    	 if(arr[mid]==(n-mid))
    	 {
    		 System.out.println(arr[mid]);
    		 return;
    	 }
    	   else if (arr[mid]<(n-mid))
    		   low=mid+1;
           else
               high=mid-1;
       }
		System.out.println(n-low);
		
		
	}

}
