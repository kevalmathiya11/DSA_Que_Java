//Write a program to cyclically rotate an array by one.

import java.util.Scanner;

public class CyclicalyRotateArray {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cyclicalyRotate(arr);

    }

    static void cyclicalyRotate(int arr[]) {

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (i > 0)
                arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        System.out.println("Cyclicaly rotated array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}