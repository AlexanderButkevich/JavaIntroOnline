package by.epam.training_center.cycles;

import java.util.Scanner;

public final class Task7 {
    public static void solution() {
        int m,n;

        Scanner sc = new Scanner(System.in);
        System.out.print("m=");
        m = sc.nextInt();
        System.out.print("n=");
        n = sc.nextInt();
        sc.close();

        for (int i = m; i <= n; i++) {
            System.out.println("number: " + i);
            printDividers(i);
        }
    }

    private static void printDividers(int number) {
        int divider = number / 2;
        boolean hasDividers = false;
        while (divider > 1) {
            if (number%divider == 0) {
                hasDividers = true;
                System.out.println("\t" + divider);
            }
            divider--;
        }
        if (!hasDividers) {
            System.out.println("\t-");
        }
    }
}
