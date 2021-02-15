package backtracking;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Palindrome_Partition_Q131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<List<String>> res=new ArrayList<>();
		
		partitionHelper(s,0,res,new ArrayList<String>());
		
     for(List x:res)
	System.out.println(x);

	}

	private static void partitionHelper(String s, int index, List<List<String>> res, ArrayList<String> temp) {
	
		int i,n=s.length();
		//Base case
		if(index==n)
		{
			res.add(new ArrayList<String>(temp));
			return;
		}
		// Recursive case
	
		String prefix="";
		// Possibilities for the partition
		for( i=index;i<n;i++)
		{
			prefix+=s.charAt(i);
			if(isPallin(s,index,i))
			{
				temp.add(prefix);
				partitionHelper(s,i+1,res,temp);
				temp.remove(temp.size()-1);
			}
		
		}
			 
		
	}

	private static boolean isPallin(String prefix, int start, int end) {
		
		char ch[]=prefix.toCharArray();
		while(start<=end)
		{
			if(ch[start]!=ch[end])
				return false;
		start++;
		end--;
		}
		return true;
	}

}
 