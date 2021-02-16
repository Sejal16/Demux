package backtracking;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Subsets_Q78 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
	
		List<List<Integer>> res= new ArrayList<>(); 
		subset(arr,0,res,new ArrayList<Integer>());
		for(  List<Integer> k : res)
			System.out.println(k);
	}

	private static void subset(int[] arr, int start, List<List<Integer>> res, ArrayList<Integer> temp) {
		
		// Base Case
		if(start==arr.length)
		{
			res.add(new ArrayList<>(temp));
			return ;
		}
		
		temp.add(arr[start]);
		subset(arr,start+1,res,temp);
		temp.remove(temp.size()-1);
		
		subset(arr,start+1,res,temp);
		
	}
}
