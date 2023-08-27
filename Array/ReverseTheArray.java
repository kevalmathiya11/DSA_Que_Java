//Reverse the array

import java.util.Scanner;

public class ReverseTheArray {

    public static void main(String[] args) {

        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}