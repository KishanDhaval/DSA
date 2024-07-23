import java.util.*;

public class Patterns {

    private static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void Pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern9(int n) {
        Pattern7(n);
        Pattern8(n);
    }

    private static void Pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i > n) {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // star
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void Pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern12(int n) {

        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern13(int n) {
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }

            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char cnt = 'A';
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char cnt = 'A';
            // star
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern16(int n) {
        char cnt = 'A';
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
            }
            cnt++;
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            char cnt = 'A';
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Alphabet
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j >= i) {
                    System.out.print(cnt + " ");
                    cnt--;
                } else {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            }
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern18(int n) {
        char cnt = 'A';
        for (int i = 1; i <= n; i++) {
            cnt = (char) ('A' + n - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt--;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern19(int n) {
        int totalRows = 2 * n;
        int spaces = 0;

        for (int i = 1; i <= totalRows; i++) {
            // Stars on the left side
            int stars = (i > n) ? i - n : n - i + 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            if (i > n) {
                spaces -= 2;
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                spaces += 2;
            }

            // Stars on the right side
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    private static void Pattern20(int n) {
        int spaceCount = 2 * (n - 1);

        for (int i = 1; i <= 2 * n - 1; i++) {
            int starCount = i > n ? 2 * n - i : i;

            // Print stars
            for (int j = 1; j <= starCount; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= starCount; j++) {
                System.out.print("*");
            }

            // Adjust spaceCount
            if (i < n) {
                spaceCount -= 2;
            } else {
                spaceCount += 2;
            }

            System.out.println();
        }

        System.out.println();
    }

    private static void Pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


 private static void Pattern22(int n) {
    int size = 2 * n - 1;

    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
            // Calculate the minimum distance to the edges
            int minDistance = Math.min(Math.min(i - 1, j - 1), Math.min(size - i, size - j));
            // Determine the value to print
            int value = n - minDistance;
            System.out.print(value);
        }
        System.out.println();
    }
    System.out.println();
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            int n = sc.nextInt();
            Pattern22(n);
        }
        sc.close();
    }

}
