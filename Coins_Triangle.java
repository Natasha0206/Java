/* package codechef; // don't place package name! */

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
		    int N = sc.nextInt();
		    
		    int height = 0;
		    
		    while(((height*(height+1))/2) < N){
		        height = height + 1;
		    }
		    if((height*(height+1))/2 == N)
		        System.out.println(height);
		    else
		        System.out.println(height-1);
		    
		    T--;
		}
	}
}