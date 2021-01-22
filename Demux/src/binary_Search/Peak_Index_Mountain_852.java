package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Peak_Index_Mountain_852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int low,high,mid;
		low=0;high=n-1;
        while(low<high)
        {
             mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
                high=mid;
            else
                low=mid+1;
        }
        System.out.println(low);
        
        

	}

}
