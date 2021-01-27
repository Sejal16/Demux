package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Capcity_toShip_Ddays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int days=sc.nextInt();
		int sum=0,max=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			max=Math.max(max, arr[i]);
		}
		int low=max,high=sum;
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(capacity(arr,mid)<=days)
				high=mid;
			else
				low=mid+1;
		}
		System.out.println(low);
		
	}

	private static int capacity(int[] arr, int mid) {
		int s=0,c=1;;
		for (int i = 0; i < arr.length; ) {
		if((s+arr[i])<=mid )
		{
			s+=arr[i];
			i++;
		}
		else
		{
			s=0;
			c++;
		}
		}
		return c;
	}

}
