import java.util.*;

// this program indicate basic hashing using which we accesing array element lesser than O(N) time complexities by storing count in hash array

public class arrHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //THIS IS FOR INTEGER ARRAY
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hashh = new int[1000001];

        for (int i = 0; i < arr.length; i++) {
            hashh[arr[i]]++;
        }

        int check = sc.nextInt();

        while (check > 0) {
            int num = sc.nextInt();
            System.out.println(hashh[num]);
            check--;
        }

/*
    //THIS IS FOR CHAR ARRAY
        
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.next().charAt(0);
        }
        // if all character come to the action then size of hash would be 256 because total charecter are 256
        int[] hashh = new int[26];
        // Hashing for lower case Character
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] >= 'a' && arr[i] <= 'z') {
                int inx = arr[i] - 'a';
                hashh[inx]++;
            }
        }

        int check = sc.nextInt();

        while (check > 0) {
            int num = sc.next().charAt(0);
            System.out.println(hashh[num-'a']);
            check--;
        }
*/
        sc.close();
    }
}
/*input format for int 
5
1 2 5 3 2 
5
1
2
7
3
4

 */
/*Input format for char
5
a a c d r 
5
a
f
b
c
r
 */
