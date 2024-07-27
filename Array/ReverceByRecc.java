import java.util.*;

public class ReverceByRecc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ArrRev(arr , 0 , size-1);
        
        // printing array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
       
         sc.close();
    }
    private static void ArrRev(int []arr , int low , int high ){
        if(low > high){
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        ArrRev(arr, low+1, high-1);
    }
}