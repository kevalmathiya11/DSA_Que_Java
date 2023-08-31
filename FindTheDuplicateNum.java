import java.util.Scanner;

public class FindTheDuplicateNum {

    public static void main(String[] args) {

        System.out.println("How many element you want to enter:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicateNum(arr);
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

    static void findDuplicateNum(int arr[]) {

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                System.out.println("repeated number :" + arr[i]);
            }
        }
    }
}
