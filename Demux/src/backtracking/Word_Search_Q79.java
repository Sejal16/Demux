package backtracking;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Word_Search_Q79 {
	 static int dir[][]= {{1,0},{0,1},{-1,0},{0,-1}};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n=sc.nextInt();
	 char arr[][]=new char[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;i<n;i++)
				arr[i][j]=sc.next().charAt(0);
		
		  String word=sc.next();
        boolean res=false;
		boolean visited[][]=new boolean[m][n];
		  for(int i=0;i<m;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				res=  search(arr,word,visited,0,i,j);
				if(res==true)
System.out.println("True");			  }
		  }
		System.out.println("Flase");
	}

	private static boolean search(char[][] arr,String word, boolean[][] visited, int start,int i,int j) {
		
		// base case
		if(word.length()==start)
			return true;
		int m=arr.length;
		int n=arr[0].length;
		if(i>=m || i< 0 || j>=n || j<0)
		return false;
		
		if(visited[i][j] == true) return false;
		if(arr[i][j]!=word.charAt(start))
			return false;
		visited[i][j]=true;
		boolean res=false;
		for(int k=0;k<4;k++) {
			res=search(arr,word,visited,start+1,i+dir[k][0],j+dir[k][1]);
		
			if(res==true) {
		visited[i][j]=false;
	
		return true;
		}}
		
		visited[i][j]=false;
		
		return res;
	
	}

	
}
