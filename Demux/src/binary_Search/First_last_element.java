package binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class First_last_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		 // First element
        // F*T*
        // First T 
        // P(x): x>=targert
        int ans[]=new int[2];
        int low,high,mid;
        
        if(n==0){
            ans[0]=-1;
            ans[1]=-1;
            System.out.println(Arrays.toString(ans));
        }
        low=0;high=n-1;
        while(low<high)
        {
             mid=low+(high-low)/2;
            if(arr[mid]>=target)
                high=mid;
            else
                low=mid+1;
                
        }
        if(arr[low]!=target)
        {
            ans[0]=-1;
            ans[1]=-1;
            System.out.println(Arrays.toString(ans));
        }
        else
            ans[0]=low;
        
        //Last element
        //F*T*
        //Last F
        //P(x)= x>target
        high=n-1;
        while(low<high)
        {
             mid=low+(high-low+1)/2;
            if(arr[mid]>target)
                high=mid-1;
            else
                low=mid;
        }
        ans[1]=low;
        
        System.out.println(Arrays.toString(ans));

	}

}
