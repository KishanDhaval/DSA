import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // taking array from user
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // MergeSort
        mergeSort(arr , 0 , arr.length -1);

         // printing array
         for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void mergeSort(int[]arr ,int low ,int high){
        if(low >= high)return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr , low , mid , high);
    }
    private static void merge(int [] arr , int low , int mid , int high){
        int []temp  = new int[high-low+1];
        int count=0;
        int left = low;
        int right = mid+1;

        while(left<=mid  && right <= high){
            if(arr[left]<arr[right]){
                temp[count]=arr[left];
                count++;
                left++;
            }
            else{
                temp[count] = arr[right];
                count++;
                right++;
            }
        }
        while(left<=mid){
            temp[count]=arr[left];
            count++;
            left++;
        }
        while(right<=high){
            temp[count]=arr[right];
            count++;
            right++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low+i] = temp[i];
        }
    }
}