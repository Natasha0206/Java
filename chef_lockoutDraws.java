

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    if((A == (B+C)) || (B == (A+C)) || (C == (A+B)))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    
		    T--;
		}
	}
}