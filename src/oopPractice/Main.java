package oopPractice;
import java.util.Scanner;
/**
 * Created by user22 on 25.07.2017.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CarDoor door = new CarDoor();
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        System.out.println("Дверцята відчинені? " + door.openCloseDoor());
        CarWheel wheel = new CarWheel();
        System.out.println("Целостность колеса равна " + wheel.getTireState());
        wheel.eraseTire(50);
        System.out.println("Целостность колеса равна " + wheel.getTireState());
        wheel.changeTire();
        System.out.println("Целостность колеса равна " + wheel.getTireState());
        System.out.println("Введите количество колес в машине");
     //   int x = sc.nextInt();
        Car ferrari = new Car(28, 12, 1989);
        System.out.println("Сколько колес будет у машини");
        int numberOfTires = sc.nextInt();
        ferrari.otherCarwheel = new CarWheel[numberOfTires];
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            ferrari.otherCarwheel[i] = new CarWheel(0);
        }
        ferrari.otherCarwheel[0] = new CarWheel(0.7f);
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            System.out.println(ferrari.otherCarwheel[i].getTireState());
        }
    //    ferrari.removeAllWheels();
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            System.out.println(ferrari.otherCarwheel[i].getTireState());
        }

        ferrari.showInfoCar();
    }


}
