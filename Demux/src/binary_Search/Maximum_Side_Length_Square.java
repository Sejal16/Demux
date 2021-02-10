package binary_Search;
// Q:  https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Maximum_Side_Length_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]=new int[m][n];
		for (int i = 0; i < m; i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
		}}
		
		//Finding prefix array of the 2D matrix
		int prefix[][]=new int[m][n];
		
		///Easy way to do
//		for(int i=1;i<m;i++)
//			arr[i][0]+=arr[i-1][0];
//		for(int i=1;i<n;i++)
//			arr[0][i]+=arr[0][i-1];
//		for(int i=1;i<m;i++)
//		{
//			for(int j=1;j<n;j++)
//			{
//				arr[i][j]=arr[i][j]+arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1];
//			}
//		}
		
		for(int i=0;i<m;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				c+=arr[i][j];
				prefix[i][j]=c;
				if(i-1>=0)
				prefix[i][j]+=prefix[i-1][j];
			}
		}
		
		//   
		for (int i = 0; i < m; i++) {
			for(int j=0;j<n;j++)
				System.out.print(prefix[i][j]+" ");
		System.out.println();
		}
		
		
	}

}
