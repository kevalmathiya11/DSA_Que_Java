//Find the Union and Intersection of the two sorted arrays.

import java.util.Scanner;

public class FindUnionIntersection {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter in 1st array:");

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of 1st array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc1.nextInt();
        }
        System.out.println("How many element you want to enter in 2nd array:");

        Scanner sc2 = new Scanner(System.in);
        int m = sc2.nextInt();

        int b[] = new int[m];

        System.out.println("Enter the element of 2nd array:");

        for (int i = 0; i < m; i++) {
            b[i] = sc2.nextInt();
        }
        unionOfTwoArray(a, b);
        intersectionOfTwoArray(a, b);
    }

    // Union of two array
    static void unionOfTwoArray(int a[], int b[]) {

        int n = a.length;
        int m = b.length;

        int u[] = new int[n + m];

        for (int i = 0; i < n; i++) {
            u[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            u[n + i] = b[i];
        }
        // Sort the array
        for (int i = 0; i < n + m; i++) {
            int j = i;

            while (j > 0 && u[j - 1] > u[j]) {
                int temp = u[j - 1];
                u[j - 1] = u[j];
                u[j] = temp;
                j--;
            }
        }
        System.out.println("Union of two array is :");

        for (int i = 0; i < n + m; i++) {
            if (i < n + m - 1 && u[i] == u[i + 1]) {
                continue;
            }
            System.out.println(u[i]);
        }
    }

    // Intersection of array
    static void intersectionOfTwoArray(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int min;
        int temp = 0;

        int in[] = new int[m];

        if (n < m) {
            min = n;
        } else
            min = m;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    in[temp++] = a[i];

                }
            }

        }
        // sort the array
        for (int i = 0; i < min; i++) {
            int j = i;
            while (j > 0 && in[j - 1] > in[j]) {
                int temp2 = in[j - 1];
                in[j - 1] = in[j];
                in[j] = temp2;
                j--;
            }
        }
        System.out.println("Intersection of two array is :");

        for (int i = min - temp; i < min; i++) {

            if (i < min - 1 && in[i] == in[i + 1]) {
                continue;
            }

            System.out.println(in[i]);
        }
    }
}
