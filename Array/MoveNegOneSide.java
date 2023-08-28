//Move all the negative elements to one side of the array 

import java.util.Scanner;

public class MoveNegOneSide {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveNeg(arr);
    }

    static void moveNeg(int arr[]) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[start++] = arr[i];
            }
            if (arr[i] > 0) {
                arr2[end--] = arr[i];
            }
        }
        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
    }
}
