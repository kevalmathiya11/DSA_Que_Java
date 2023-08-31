//Minimum no. of Jumps to reach end of an array

import java.util.Scanner;

public class MinimumNumberOfJumps {

    public static void main(String[] args) {

        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getMinJump(arr);
    }

    static void getMinJump(int arr[]) {
        int pos = 0;
        int des = 0;
        int jump = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            des = Math.max(des, arr[i] + i);

            if (pos == i) {
                pos = des;
                jump++;
            }
        }
        System.out.println(jump + " minimum jumps required to arrive destination.");
    }
}