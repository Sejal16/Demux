package bits;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Counting_bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		

        int res[]=new int[num+1];
        int i=1;
        res[0]=0;
        for(int j=1;j<=num;j++)
        {
        	res[j]=res[j&(j-1)]+1;        	
//            int c=0;
//            int temp=j;
//            while(temp>0)
//            {
//            	temp=(temp&(temp-1));
//                c++;
//            }
//            res[i++]=c;
            
        }
        System.out.println(Arrays.toString(res));
        
	}

}
