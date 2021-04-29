package by.epam.training_center.decomposition;

public final class Task2 {
    public static int gcd(int n1, int n2, int n3, int n4) {
        return Task1.gcd(n1, Task1.gcd(n2, Task1.gcd(n3, n4)));
    }
}
