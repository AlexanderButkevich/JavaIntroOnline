package by.epam.training_center.part1.beans.task7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Classes and Objects
 */
public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double ab, double bc, double ca) {
        if (ab <= bc + ca &&
                bc <= ab + ca &&
                ca <= ab + bc) {
            double cY = (pow(ca, 2) - pow(bc, 2) + pow(ab, 2)) / (2 * ab);
            double cX = sqrt(pow(bc, 2) - pow(cY - ab, 2));
            a = new Point(0, 0);
            b = new Point(0, ab);
            c = new Point(cX, cY);
        } else {
            Point zPoint = new Point(0,0);
            a = zPoint;
            b = zPoint;
            c = zPoint;
        }
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getAB() {
        return a.distanceTo(b);
    }

    public double getBC() {
        return b.distanceTo(c);
    }

    public double getCA() {
        return c.distanceTo(a);
    }

    public double getPerimeter() {
        return getAB() + getBC() + getCA();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return sqrt(p * (p - getAB()) * (p - getBC()) * (p - getCA()));
    }

    public Point getMedianPoint() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x,y);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
