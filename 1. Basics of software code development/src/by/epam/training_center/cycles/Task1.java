package by.epam.training_center.cycles;

import java.util.Scanner;

public final class Task1 {
    public static void solution() {
        int number, result=0;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= number ; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
