package bits;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Single_Number_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	
	int xor=0;
	for (int i = 0; i < arr.length; i++) {
		xor^=arr[i];
		
	}
	System.out.println(xor);
	}

}
