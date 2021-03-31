package by.epam.training_center.cycles;

public final class Task5 {
    public static void solution(double e) {
        double sum = 0;
        final double TOTAL_SUM = 1.5; /*    b1/(1-q)
                                            0.5 / 1 - 0.5 = 1
                                            0.33 / 1 - 0.33 = 0.5
                                            1 + 0.5 = 1.5 */

        if (e>0) {
            double n = 1;
            while (true) {
                double a = 1/Math.pow(2,n) + 1/Math.pow(3,n);
                if (a>=e) {
                    sum += a;
                    n++;
                } else {
                    break;
                }
            }
        } else {
            sum = TOTAL_SUM;
        }
        System.out.println(sum);
    }
}
