package by.epam.training_center.decomposition;

public final class Task6 {
    public static boolean isCoPrime(int a, int b, int c) {
        return Task1.gcd(a, Task1.gcd(b, c)) == 1;
    }
}
