package backtracking;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Permutation_Q46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		List<List<Integer>> res=new ArrayList<>();
		permute(arr,res,new ArrayList<Integer>());
		
		for(List x: res)
			System.out.println(x);
	}

	private static void permute(int[] arr,  List<List<Integer>> res, ArrayList<Integer> temp) {
		
		if(temp.size()==arr.length)
		{
			res.add(new ArrayList<>(temp));
			return;
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
		if(temp.contains(arr[i]))
			continue;
			temp.add(arr[i]);
			permute(arr,res,temp);
			temp.remove(temp.size()-1);
			
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
