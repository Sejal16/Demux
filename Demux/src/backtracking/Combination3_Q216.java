package backtracking;

import java.util.*;
import java.util.Scanner;

public class Combination3_Q216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int k=sc.nextInt();
		
		
	    List<List<Integer>> res=new ArrayList<List<Integer>>();
        f(1,n,k,res,new ArrayList<>());
    	
		for(List<Integer> x: res )
			System.out.println(x);
    }
    
    public static void f(int i,int n,int k,List<List<Integer>> res,List<Integer> temp)
    {
        if(k==0 && n==0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        if(n<0)
            return;
        if(i>9)
            return;
        
        temp.add(i);
        f(i+1,n-i,k-1,res,temp);
        temp.remove(temp.size()-1);
        
        f(i+1,n,k,res,temp);
    }
}