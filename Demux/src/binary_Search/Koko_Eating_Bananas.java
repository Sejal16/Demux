package binary_Search;
// Q:https://leetcode.com/problems/koko-eating-bananas/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Koko_Eating_Bananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		int hours=sc.nextInt();
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
		}
		int low=1,high=max;
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(time(arr,mid)<=hours)
				high=mid;
			else
				low=mid+1;
		}
		System.out.println(low);

	}

	private static int time(int[] arr, int mid) {
		
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=mid)
				s+=1;
			else
				s+=(int)Math.ceil(arr[i]/(mid+0.0));
		}
		
		return s;
	}

}
