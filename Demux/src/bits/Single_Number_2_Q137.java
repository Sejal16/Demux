package bits;

import java.util.*;

public class Single_Number_2_Q137 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int num=0;
		for(int i=0;i<32;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&(1<<i))!=0)
					c++;
			}
			if(c%3==1)
				num=(num|(1<<i));
				
		}
		System.out.println(num);
	}

}
