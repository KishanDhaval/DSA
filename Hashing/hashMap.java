import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // INTEGER ARRAY
        int[] intArr = new int[n];
        Map<Integer, Integer> intMap = new HashMap<>();
        
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            intMap.put(intArr[i], intMap.getOrDefault(intArr[i], 0) + 1);
        }
        
        System.out.println("items -> ocurance in array");
        int intQueries = sc.nextInt();
        while (intQueries > 0) {
            int querie = sc.nextInt();
            System.out.println("\t"+querie + " -> " + intMap.getOrDefault(querie, 0));
            intQueries--;
        }
        
        // Separate the input sections clearly
        System.out.println("");
        // CHARACTER ARRAY
        char[] charArr = new char[n];
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = sc.next().charAt(0);
            charMap.put(charArr[i], charMap.getOrDefault(charArr[i], 0) + 1);
        }

        int charQueries = sc.nextInt();
        while (charQueries > 0) {
            char querie = sc.next().charAt(0);
            System.out.println("\t"+querie + " -> " + charMap.getOrDefault(querie, 0));
            charQueries--;
        }
        
        sc.close();
    }
}

/* Input format:
5
1 2 5 3 2
5
1
2
7
3
4
a b c a d
3
a
b
z
*/
