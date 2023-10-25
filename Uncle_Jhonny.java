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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int j =0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            int length=arr[k-1];
            int index =0;
            Arrays.sort(arr);
            int start =0;
            int end = arr.length-1;
            int mid =0;
            while(start<=end){
                mid = (start+end)/2;
                if(arr[mid]==length){
                    index = mid;
                    break;
                }
                else if (arr[mid]>length){
                    end = mid-1;
                }
                else if(arr[mid]<length){
                    start = mid +1;
                }
            }
            System.out.println(index+1);


       }
	}
}