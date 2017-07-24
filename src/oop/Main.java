package oop;

/**
 * Created by user22 on 24.07.2017.
 */
public class Main {
    public static void main(String[] args){
        Point P1 = new Point(12.1111, 45.5566);
        Point P2 = new Point(12.1111, 45.5566);
        Circle C1 = new Circle(P1, 45.5566);
        Circle C2 = new Circle(P2, 22.5566);
        double result = P1.calcLength(P2);
        System.out.println(result);
        boolean colis = C1.collisionCheck(C2);
        System.out.println(colis);
    }
}
