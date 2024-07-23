import java.util.*;

public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // taking array from user
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // QUICK SORT
        quickSort(arr, 0, arr.length - 1);

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = getPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    private static int getPartition(int[] arr, int low, int high) {
        int i = low, j = high;
        int pivot = low;

        while (i < j) {
            while (arr[i] <= arr[pivot] && i < high) {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }
}