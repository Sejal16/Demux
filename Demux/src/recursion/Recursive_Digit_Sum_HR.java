package recursion;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Recursive_Digit_Sum_HR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String n = sc.next();
		int k=sc.nextInt();
		System.out.println(superDigit(n,k));

	}

	private static int  superDigit(String n, int k) {
		long  num=0;
	
			for(int j=0;j<n.length();j++)
			  num+= (n.charAt(j)-'0');
		int  res=digit(num);
		return res;
	}

	private static int digit(long num) {
		if(num <10)
			return (int) num;
		long c=sum(num);
	return	digit(c);
	
	}

	private static long sum(long num) {
		if(num==0)
			return 0;
		return (num%10+sum(num/10));
	
	}

}


