package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SMallest_Element_In_Rotated_Sorted_array {

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
            if(arr[mid]<arr[0])
                high=mid;
            else
                low=mid+1;
        }
        if(arr[low]<arr[0])            
        System.out.println(arr[low]);
        else
        	System.out.println(arr[0]);
        
	}

}
