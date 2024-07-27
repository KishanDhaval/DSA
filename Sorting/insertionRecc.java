import java.util.*;

public class insertionRecc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // taking array from user
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // INSERTION SORT
        insertionSort(arr, 1, size);

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    private static void insertionSort(int[] arr, int base, int size) {
        if (base > size - 1) {
            return;
        }
        helper(arr, base, arr[base]);
        insertionSort(arr, base + 1, size);
    }

    private static void helper(int[] arr, int pos, int value) {
        if (pos <= 0 || arr[pos - 1] <= value) {
            arr[pos] = value;
            return;
        }
        arr[pos] = arr[pos - 1];
        helper(arr, pos - 1, value);
    }
}