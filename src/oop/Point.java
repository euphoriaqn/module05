package oop;

/**
 * Created by user22 on 24.07.2017.
 */
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint) {
        double d = Math.sqrt(Math.pow(x - otherPoint.x, 2) + Math.pow(y - otherPoint.y, 2));
        return d;
    }
}
