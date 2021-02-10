package backtracking;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Combinations_Q77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		List<List<Integer>> res= new ArrayList<>();
		//List<Integer> currSet=new ArrayList<>();
		
		f(1,n,k,new ArrayList<>(),res);
		
		for(List<Integer> x: res )
			System.out.println(x);

	}

	private static void f(int i, int n, int k, List<Integer> currSet, List<List<Integer>> res) {
		//Base case
		//Positive baase case
		if(k==0)
		{
			res.add(new ArrayList<Integer>(currSet));
			return;
					
		}
		
		// Empty Suffix array
		// k is non zero
		if(i>n)
		{
			return;
		}
		// pruning step
		if(n-i+1<k)
			return;
		
		// Recursive Step
		// exclude
		f(i+1,n,k,currSet,res);
		
		//Include
		// Push down the contribution
		//currSet= new ArrayList<Integer>();
		currSet.add(i);
		f(i+1,n,k-1,currSet,res);
		currSet.remove(currSet.size()-1);
		
	}

}
