import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // taking array from user
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        

        for (int i = 0; i < arr.length-1 ; i++) {
            int isSwap = 0;
            for (int j = 0; j < arr.length - i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap=1;// this condition is for best case
                }
                System.out.println("hey");
            }
            if(isSwap==0){
                break;
            }
        }

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}