package backtracking;

import java.util.*;

public class Subset2_Q90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
	Arrays.sort(arr);
		List<List<Integer>> res= new ArrayList<>(); 
		subset2(arr,0,res,new ArrayList<Integer>());
		for(  List<Integer> k : res)
			System.out.println(k);
	}

	private static void subset2(int[] arr, int index, List<List<Integer>> res, ArrayList<Integer> temp) {
		
		if(index==arr.length)
		{
			res.add(new ArrayList<>(temp));
			return;
		}
		
		temp.add(arr[index]);
		subset2(arr,index+1,res,temp);
		temp.remove(temp.size()-1);
		
		int i,prev =arr[index];
		for(i=index;i<arr.length && arr[i]==prev;i++);
		subset2(arr,i,res,temp);
	
	}

	}


