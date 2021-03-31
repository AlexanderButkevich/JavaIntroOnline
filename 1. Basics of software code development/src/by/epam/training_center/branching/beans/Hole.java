package by.epam.training_center.branching.beans;

public class Hole {
    private double a;
    private double b;

    public Hole() {
    }

    public Hole(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean isFit(Brick brick) {
        double x = brick.getX();
        double y = brick.getY();
        double z = brick.getZ();
        double minBrick = Math.min(Math.min(x, y), x);
        double midBrick;
        if (minBrick == x) {
            midBrick = Math.min(y, z);
        } else if (minBrick == y) {
            midBrick = Math.min(x, z);
        } else {
            midBrick = Math.min(x, y);
        }
        return minBrick <= Math.min(a,b) && midBrick <= Math.max(a,b);
    }
}
