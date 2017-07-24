package oop;

/**
 * Created by user22 on 24.07.2017.
 */
public class Circle {
    double radius;
    Point otherP;

    public Circle(Point otherPp, double radius) {

        this.otherP = otherPp;
        this.radius = radius;
    }
    public boolean collisionCheck(Circle otherCircle){
        if (otherP.x + radius <= otherCircle.otherP.x - radius || otherP.y - radius <= otherCircle.otherP.x + radius || otherP.y + radius <= otherCircle.otherP.y - radius || otherP.y - radius <= otherCircle.otherP.y + radius)
            return true;
        else return false;

    }
}
