package by.epam.training_center.cycles;

import java.math.BigInteger;

public final class Task4 {
    public static void solution() {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            res = res.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(res);
    }
}
