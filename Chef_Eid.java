/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		        
		    }
		    Arrays.sort(a);
		    int min = Integer.MAX_VALUE;
		    for(int j=0;j<n-1;j++){
		        min = Math.min(min , Math.abs(a[j] - a[j+1]));
		        
		    }
		    System.out.println(min);
		  
		}
	}
}Magic_Pairs