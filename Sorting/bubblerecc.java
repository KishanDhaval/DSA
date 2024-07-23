import java.util.*;

public class bubblerecc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // taking array from user
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        

        bubble(arr , size);

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    static void bubble(int[] arr , int n){
        if(n<=0){
            return;
        }
        helper(arr , 0 , n);
        bubble(arr, n-1);
    }

    static void helper(int []arr , int i , int n){
        if(i>n-2)return;
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
        }
        helper(arr , i+1 , n);
    }
}