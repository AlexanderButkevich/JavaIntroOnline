package by.epam.training_center.branching.beans;

public class Line {
    private double k = 1;
    private double b = 0;

    public Line() {
    }

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Line(Point p1, Point p2) {
        this.k = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
        this.b = p1.getY() - this.k*p1.getX();
    }

    public boolean atPoint(Point p) {
        return p.getY() == k * p.getX() + b;
    }

}
