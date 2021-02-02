package bits;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_Integers_Q371 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b=sc.nextInt();

//if(a<0)
//{
//	a=~a;
//	a=a+1;
//}
//if(b<0)
//{
//	b=~b;
//	b=b|1;
//}
int ans=0,carry=0;
for (int i = 0; i <32; i++) {
	int p= a&(i<<1);
	int q= b&(i<<1);
	if(p==0 && q==0 )
		if(carry==1)
		{
			ans=ans|(1<<i);
			carry=0;
		}
		
	else if( p==1 && q==0)
		{
		if(carry==1)
		{
			ans=ans|p;
		carry=1;
		}
		else
			carry=0;
		}
	else if(p==0 && q==1)
		if(carry==1)
		{
		ans=ans|q;
		carry=1;
		}
		else
			carry=0;
	else
		{
		if(carry==0)
		{
			ans|=0;
		}
		else
		{
		ans|=p;
		
		}carry=1;
		}
	
	
}
System.out.println(ans);

	}

}
