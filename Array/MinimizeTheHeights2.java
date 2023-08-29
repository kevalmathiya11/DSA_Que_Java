//Minimise the maximum difference between heights [V.IMP]

import java.util.Scanner;

public class MinimizeTheHeights2 {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("For Increasing and Decreasing height enter the value of K: ");

        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt();

        sort(arr);
        int ans = getMinDiff(arr, k);
        System.out.println("The maximum difference is:" + ans);
    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    static int max(int a, int b) {
        int max = a;
        if (a < b) {
            return b;
        }
        return max;
    }

    static int min(int a, int b) {
        int min = a;
        if (a > b) {
            return b;
        }
        return min;
    }

    static int getMinDiff(int arr[], int k) {
        int n = arr.length;
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int min, max;

        for (int i = 0; i < arr.length - 1; i++) {
            min = min(smallest, arr[i] + k);
            max = max(largest, arr[i + 1] - k);

            ans = min(ans, max - min);

        }

        return ans;

    }

}
