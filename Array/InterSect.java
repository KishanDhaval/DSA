import java.util.*;

public class InterSect {

    // TC -> O(size1 + size2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Intersaction function
       List<Integer> list = intersectArr(arr1 ,size1,  arr2, size2);
       

        System.out.println("InterSection  : ");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        sc.close();
    }
    private static List<Integer> intersectArr(int[] arr1 ,int size1, int[] arr2 , int size2){
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return list;
    }
}