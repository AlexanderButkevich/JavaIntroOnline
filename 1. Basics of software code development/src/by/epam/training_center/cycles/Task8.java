package by.epam.training_center.cycles;

public final class Task8 {
    public static void solution(int num1, int num2) {
        int result = 0;
        int num = num1;
        boolean hasZero = false;
        while (num>0) {
            int nextDig = num%10;
            if (hasDigit(num2, nextDig) && !hasDigit(result, nextDig)) {
                if (nextDig == 0) {
                    hasZero = true;
                } else {
                    result = result*10 + nextDig;
                }
            }
            num = (num - nextDig)/10;
        }
        if (result > 0) {
            if (hasZero) {
                result *= 10;
            }
            System.out.println(result);
        } else if (hasZero) {
            System.out.println("0");
        } else {
            System.out.println("-");
        }

    }

    private static boolean hasDigit(int num, int dig) {
        while(num>0) {
            int nextDig = num%10;
            if (nextDig == dig) {
                return true;
            }
            num = (num - nextDig)/10;
        }
        return false;
    }
}
