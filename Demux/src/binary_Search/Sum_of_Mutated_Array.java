package binary_Search;
//Q : https://leetcode.com/problems/sum-of-mutated-array-closest-to-target/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_Mutated_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max,arr[i]);
		}
		int low=1,high=max;
		while(low<high)
		{
			int mid=low+(high-low+1)/2;
			if(mute(arr,mid)>target)
				high=mid-1;
			else
				low=mid;
		}
		if(Math.abs(target-mute(arr,low))<=Math.abs(target-mute(arr,low+1)))
			System.out.println(low);
		else
			System.out.println(low+1);
		
	}

	private static int mute(int[] arr, int mid) {
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>mid)
				s+=mid;
			else
				s+=arr[i];
		}
		return s;
		

	}

}
