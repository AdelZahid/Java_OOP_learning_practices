import java.util.*;

public class stringpermutationrecur {
    public static int first = -1;
    public static int last = 0;

    public static void findoc(String s, int i, char c) {
        if (i == s.length()) {
            System.out.println(first + " " + last);
            return;
        }
        char cur = s.charAt(i);
        if (c == cur) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        findoc(s, ++i, c);

    }

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        findoc(s, 0, c);
    }
}
