//Find the maximum and minimum element in an array

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = max(arr);
        System.out.println("The maximum element is:" + max);

        int min = min(arr);
        System.out.println("The minimum element is:" + min);
    }

    static int max(int arr[]) {

        int max = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int arr[]) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}