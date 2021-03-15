package backtracking;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Permutation2_Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		 boolean visited[]=new boolean[arr.length];
	        Arrays.sort(arr);
	        	List<List<Integer>> res=new ArrayList<>();
			permute(arr,res,new ArrayList<Integer>(),visited);
			
			for(List x: res)
				System.out.println(x);
	    }
	    	private static void permute(int[] arr,  List<List<Integer>> res, ArrayList<Integer> temp,boolean visited[]) {
			
			if(temp.size()==arr.length)
			{
				res.add(new ArrayList<>(temp));
				return;
				
			}
	            for(int i=0;i<arr.length;i++)
	            {
	                if(visited[i]|| i>0 && arr[i]==arr[i-1] && !visited[i-1])
	                    continue;
	        temp.add(arr[i]);
	                visited[i]=true;
	                permute(arr,res,temp,visited);
	                visited[i]=false;
	                temp.remove(temp.size()-1);
	            }
			
	    }
	}