
//Find the "Kth" max and min element of an array 
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {
        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // find kth value
        System.out.println("Enter the number to find kth small & Big element:");

        int k = sc.nextInt();

        getKthSmallest(arr, k);
        getKthBiggest(arr, k);

    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

    }

    static void getKthSmallest(int arr[], int k) {
        System.out.println(k + "th Smallest value is :" + arr[k - 1]);
    }

    static void getKthBiggest(int arr[], int k) {
        System.out.println(k + "th Biggest value is :" + arr[arr.length - k]);
    }
}
