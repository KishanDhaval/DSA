import java.util.*;

public class BasicMath {

    private static int evenlyDivides(int N) {
        int temp = N, r;
        int count = 0;
        while (N > 0) {
            r = N % 10;
            if (r != 0 && temp % r == 0) {
                count++;
            }
            N /= 10;
        }
        return count;
    }

    private static int revNum(int x) {
        int INT_MIN = -(int) Math.pow(2, 31); // -2^31
        int INT_MAX = (int) Math.pow(2, 31) - 1; // 2^31 - 1

        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Check for overflow conditions
            if (result > INT_MAX / 10 || (result == INT_MAX / 10 && pop > 7))
                return 0;
            if (result < INT_MIN / 10 || (result == INT_MIN / 10 && pop < -8))
                return 0;

            result = result * 10 + pop;
        }
        return result;
    }

    private static boolean isPalindrom(int x) {
        int temp = x, rev = 0;
        if (x < 0)
            return false;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (temp == rev)
            return true;
        return false;
    }

    private static boolean isArmstrong(int x) {
        int temp = x, rem, sum = 0;
        if (x < 0)
            return false;
        while (x > 0) {
            rem = x % 10;
            sum = sum + (rem * rem * rem);
            x /= 10;
        }
        if (temp == sum)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ans = isArmstrong(153);
        System.out.println(ans);

        sc.close();
    }
}