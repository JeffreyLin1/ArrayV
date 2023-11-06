package io.github.arrayv.sorts.misc;

public class PascalsTriangle {
    // Jeffrey Lin
    public static void main(String[] args) {
        int rows = 1;
        while (rows != 0) {
            System.out.println("num of rows, 0 to stop. Maximum 20 rows.");
            rows = 5;
            if (rows <= 0) {
                System.out.println("number less than 1 detected, stopping code now");
            }
            if (rows > 20) {
                System.out.println("Please input number less than or equal to 20.");
                continue;
            }
            tri(rows);

        }

    }

    public static void tri(int n) {
        double k = 0;
        for (double i = 0; i < n; i++) {
            for (double j = 0; j <= i; j++) {
                k = (factorial(i)) / (factorial(j) * (factorial(i - j)));

                if (j == 0) {
                    for (double p = n - i; p >= 0; p--) {
                        System.out.print("    ");
                    }
                }

                String o = String.valueOf((int) k);
                if (o.length() == 2) {
                    System.out.print((int) k + "      ");
                } else if (o.length() == 3) {
                    System.out.print((int) k + "     ");
                } else if (o.length() == 4) {
                    System.out.print((int) k + "    ");
                } else if (o.length() == 5) {
                    System.out.print((int) k + "   ");
                }

                else {
                    System.out.print((int) k + "       ");
                }
            }
            System.out.println();
        }
    }

    public static double factorial(double num) {
        double fac = num;

        if (num == 0) {
            return 1;
        }
        for (double i = num - 1; i > 0; i--) {
            fac *= num - i;
        }
        return fac;
    }
}
