package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		List<List<Integer>> res= new ArrayList<>();
		//List<Integer> currSet=new ArrayList<>();
		 combSum(arr,0,target,res,new ArrayList<Integer>());
	       
		
		
		for(List<Integer> x: res )
			System.out.println(x);

	}

	  static void combSum(int arr[],int startIndex,int target,List<List<Integer>> res,List<Integer> temp)
	    {
	        // Base Case
	        if(target==0)
	        {
	           res.add(new ArrayList<Integer>(temp));
	            return;
	        }
	        
	        if(startIndex==arr.length ||  target<0)
	            return;
	        
	        temp.add(arr[startIndex]);
	        combSum(arr,startIndex,target-arr[startIndex],res,temp);
	        temp.remove(temp.size()-1);
	        
	        combSum(arr,startIndex+1,target,res,temp);
	    }
	  
}
