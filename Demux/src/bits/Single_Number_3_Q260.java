package bits;

import java.util.*;


public class Single_Number_3_Q260 {

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
		int lsb=xor&(~(xor-1));
		int buck1=0,buck2=0;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]&lsb)==0)
				buck1^=arr[i];
			else
				buck2^=arr[i];
		}
		int ans[]= {buck1,buck2};
		System.out.println(Arrays.toString(ans));

	}

}
