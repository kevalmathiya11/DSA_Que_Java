//Merge 2 sorted arrays without using Extra space.

import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter in 1st array:");

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of 1st  sorted array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc1.nextInt();
        }
        System.out.println("How many element you want to enter in 2nd array:");

        Scanner sc2 = new Scanner(System.in);
        int m = sc2.nextInt();

        int b[] = new int[m];

        System.out.println("Enter the element of 2nd sorted array:");

        for (int i = 0; i < m; i++) {
            b[i] = sc2.nextInt();
        }
        mergeArray(a, b);
    }

    static void mergeArray(int a[], int b[]) {
        int i = 0;
        int j = 0;

        int n = a.length;
        int m = b.length;

        while (i < n) {

            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                fixArray(b);
            }
            i++;
        }
        System.out.println("After merging:");

        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
        for (int k = 0; k < m; k++) {
            System.out.println(b[k]);
        }
    }

    static void fixArray(int b[]) {

        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
    }
}
