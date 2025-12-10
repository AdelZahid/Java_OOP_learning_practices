import java.util.*;

public class patterns6 {
  public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i, j, k;
    for (i = 0; i < n; i++) {
      for (j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (k = 0; k < n; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
