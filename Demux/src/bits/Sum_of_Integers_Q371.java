package bits;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_Integers_Q371 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b=sc.nextInt();

while(b!=0)
{
	int c=a&b; // Checking if any carry present or not
	a=a^b;   /// find the sum without carry
	b=c<<1;  /// placing the carry to its right position
}

System.out.println(a);

	}

}
