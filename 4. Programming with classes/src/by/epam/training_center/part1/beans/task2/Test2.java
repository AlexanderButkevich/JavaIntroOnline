package by.epam.training_center.part1.beans.task2;

/**
 * Classes and Objects
 */
public class Test2 {
    private int variable1;
    private int variable2;

    public Test2(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public Test2() {
        variable1 = DEFAULT_VALUE;
        variable2 = DEFAULT_VALUE;
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    private static final int DEFAULT_VALUE = 100500;
}
