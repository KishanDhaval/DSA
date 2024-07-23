import java.util.*;

public class Recursion {
    private static void printNum1(int n) {
        if (n < 1)
            return;
        printNum1(n - 1);
        System.out.print(n + " ");
    }

    private static void printNum2(int n) {
        if (n < 1)
            return;
        System.out.print(n + " ");
        printNum2(n - 1);
    }

    private static long sumOfNums(int n) {
        if(n<1) return 0;
        return n+ sumOfNums(n-1);
    }

    private static long factorial(int n) {
        if(n<=0) return 1;// note the conditional return value for sum of number and in factorial 
        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            long fac = factorial(sc.nextInt());
        System.out.println(fac);
        sc.close();
    }
}