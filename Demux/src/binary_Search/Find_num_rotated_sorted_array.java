package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Find_num_rotated_sorted_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
	
		int target=sc.nextInt();
		int l=0,h=n-1,mid;
        if(n==1)
        {
            if(arr[0]==target) {
            	System.out.println(0);
            	return;
            }
            else
            	{
            	System.out.println(1);
            	return;
                
            	}
        }
        int min=0,minI=0;
        if(arr[0]<arr[n-1])
        {
        min =arr[0];
        minI=0;
           int  val=Bt(0,n-1,target,arr);
            if(arr[val]==target)
            {	System.out.println(val);
        	return;
            
        }
        }
            else{
        while(l<h)
        {
            //First T
            mid=l+(h-l)/2; ///Lower Mid
            if(arr[mid]<arr[0])
                h=mid;
            else
                l=mid+1;
        }
            min=arr[l];
            minI=l;
        }
            
        if(min==target)
            {
        	System.out.println(minI);
            
        	return ;
            }
        //System.out.println(minI);
        if(l<n-1) // && arr[minI+1]>=target && target<=arr[n-1])
        {
        	
            int val=Bt(minI+1,n-1,target,arr);
           // System.out.println(val);
            if(arr[val]==target) {
            	System.out.println(val);
            	return  ;
        }
            }
        if(l>0)
        {
            int val=Bt(0,minI-1,target,arr);
            System.out.println(val);
            
            if(arr[val]==target)
            {
            	System.out.println(val);
            	return  ;
        }
        }
        
        System.out.println(-1);

    }
    static int Bt(int low,int high,int target,int []arr)
    {
        // First true
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
}