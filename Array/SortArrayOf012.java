//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Scanner;

public class SortArrayOf012 {
    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr);
    }

    static void sort012(int arr[]) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr2[start++] = 0;
            }
            if (arr[i] == 2) {
                arr2[end--] = 2;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                arr2[start++] = 1;
            }
            System.out.println("Sorted array:");
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
            System.out.println(arr2[i]);
        }
    }
}
