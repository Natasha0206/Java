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
        for (int i = 0; i < T; i++) {
            int num_enemies = sc.nextInt();
            int health = sc.nextInt();
            int[] e_st = new int[num_enemies];
            for (int j = 0; j < num_enemies; j++) {
                e_st[j] = sc.nextInt();
            }
            int low = 0;
            int high = 2;
            int ans = 0;
            while (!check(num_enemies, health, e_st, high)) {
                high = high * 2;
            }
            while (low <= high) {
                int mid = (low + high) / 2;

                if (check(num_enemies, health, e_st, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean check(int N, int H, int[] en_health, int X) {
        for (int k = 0; k < N; k++) {
            if (en_health[k] > X) {
                if (H > en_health[k]) {
                    H = H - en_health[k];
                } else {
                    return (false);
                }
            }
        }
        if (H > 0) {
            return (true);
        } else {
            return (false);
        }
    }
}