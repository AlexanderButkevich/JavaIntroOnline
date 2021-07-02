package by.epam.training_center.part1.beans.task1;

/**
 * Classes and Objects
 */
public class Test1 {
    private int variable1;
    private int variable2;

    public void printVariables() {
        System.out.printf("variable1=%d\n", variable1);
        System.out.printf("variable2=%d", variable2);
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public int variablesSum() {
        return variable1+variable2;
    }

    public int maxVariable() {
        return Math.max(variable1, variable2);
    }
}
