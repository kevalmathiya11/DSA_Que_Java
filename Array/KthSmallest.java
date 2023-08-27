
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
        // sort the array
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        // find kth value
        System.out.println("Enter the number to find kth smallest element:");

        int k = sc.nextInt();

        System.out.println(k + "th Smallest value is :" + arr[k - 1]);
    }
}
