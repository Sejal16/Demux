package backtracking;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Combination_sum2_Q40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		Arrays.sort(arr);
		List<List<Integer>> res= new ArrayList<>();
		//List<Integer> currSet=new ArrayList<>();
		 combSum2(arr,0,target,res,new ArrayList<Integer>());
	       
		
		
		for(List<Integer> x: res )
			System.out.println(x);

	}

	private static void combSum2(int[] arr, int idx, int target, List<List<Integer>> res, ArrayList<Integer> temp) {
		
		 // Base Case
        if(target==0)
        {
           res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        if(idx==arr.length ||  target<0)
            return;
       
        
        // recursive step
        //begins with candidate[indx]
        temp.add(arr[idx]);
        combSum2(arr,idx+1,target-arr[idx],res,temp);
        temp.remove(temp.size()-1);
        
        //doesn't begin with candidates[ind]
	// Find the next element with the next distinct element
        int i,prev=arr[idx];
        for(i=idx;i<arr.length && arr[i]==prev;i++);
        
        combSum2(arr,i,target,res,temp);
	}

}
