import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // number of test cases

    while (t-- > 0) {
      int n = sc.nextInt(); // number of animals
      int[] a = new int[n]; // types of animals

      // read in the types of animals
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      // sort the array of animal types
      java.util.Arrays.sort(a);

      // count the number of animals of each type
      int[] counts = new int[101]; // maximum animal type is 100
      for (int i = 0; i < n; i++) {
        counts[a[i]]++;
      }

      // check if it is possible for Alice and Bob to end up with the same
      // multiset of animals
      boolean possible = true;
      for (int i = 0; i <= 100; i++) {
        if (counts[i] % 2 == 1) {
          // if there is an odd number of animals of a particular type,
          // it is not possible for Alice and Bob to end up with the same
          // multiset of animals
          possible = false;
          break;
        }
      }

      // print the result
      if (possible) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}