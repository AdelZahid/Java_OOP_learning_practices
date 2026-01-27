
import java.util.Scanner;

public class mergesort {
    static void merge(int arr[], int si, int mid, int ei) {
        int mergear[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergear[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                mergear[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergear[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            mergear[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < mergear.length; i++, j++) {
            arr[j] = mergear[i];
        }
    }

    static void msort(int ar[], int si, int ei) {
        if (si < ei) { 
            int mid = (si + ei) / 2;
            msort(ar, si, mid);
            msort(ar, mid + 1, ei);
            merge(ar, si, mid, ei);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        msort(ar, 0, n - 1);
        System.out.println("Sorted array:");
        for (int j = 0; j < n; j++) {
            System.out.print(ar[j] + " ");
        }
    }
}
