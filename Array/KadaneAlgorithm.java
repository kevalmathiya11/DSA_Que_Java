//find Largest sum contiguous Subarray [V. IMP]

import java.util.Scanner;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxi = maxSubArray(arr);
        System.out.println("Maximum subarray sum is:" + maxi);
    }

    static int maxSubArray(int arr[]) {
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            max = max(max, sum);
            sum = max(sum, 0);
        }
        return max;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
