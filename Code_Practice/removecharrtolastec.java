
import java.util.Scanner;

public class removecharrtolastec {
    static int count = 0;

    static public void move(String s, int i, char c, String s2) {
        if (i < s.length()) {
            if (c == s.charAt(i)) {
                count++;
                move(s, i + 1, c, s2);
            } else {
                s2 += s.charAt(i);
                move(s, i + 1, c, s2);
            }
        } else {
            for (int j = 0; j < count; j++) {
                s2 += c;
            }
            System.out.println(s2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a character to remove: ");
        char c = sc.next().charAt(0);
        move(s1, 0, c, "");
        sc.close();
    }
}
