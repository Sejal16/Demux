package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Smallest_Divisor_given_threshold {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
		}
		// F*T* 
		// First T
		// P(x)= sum<=target
		int low=1,high=max;
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(sum(mid,arr)<=target)
				high=mid;
			else
				low=mid+1;
		}
		System.out.println(low);

	}

	private static int sum(int mid, int[] arr) {
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			s+=(int)Math.ceil(arr[i]/(mid+0.0));
		
		}
		return s;
	}

}

