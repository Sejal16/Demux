package bits;

import java.util.Scanner;

public class Missing_NUmber_Q268 {

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
		int xor1=0;
		for(int i=1;i<=n;i++)
			xor1^=i;
		System.out.println((xor^xor1));

	}

}
