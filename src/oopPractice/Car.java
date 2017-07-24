package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class Car {
    CarWheel[] otherCarwheel;
    CarDoor[] otherCarDoor;
    private int[] dateOfManufacture;
    private String typeOfEngine;
    private int maxSpeedOfCar;
    private float accelerationTime;
    private byte numberOfPassanger;
    private byte numberOfPassangerNow;
    private int currentSpeed;
    public Car(int date, int month, int year) {
        this.dateOfManufacture[0] = date;
        this.dateOfManufacture[1] = month;
        this.dateOfManufacture[2] = year;
    }
    public Car(int date, int month, int year, String typeOfEngine, int maxSpeedOfCar, float accelerationTime, byte numberOfPassanger, byte numberOfPassangerNow, int currentSpeed){
        this.dateOfManufacture[0] = date;
        this.dateOfManufacture[1] = month;
        this.dateOfManufacture[2] = year;
        this.typeOfEngine = typeOfEngine;
        this.maxSpeedOfCar = maxSpeedOfCar;
        this.accelerationTime = accelerationTime;
        this.numberOfPassanger = numberOfPassanger;
        this.numberOfPassangerNow = numberOfPassangerNow;
        this. currentSpeed = currentSpeed;
    }
    public void changeCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public void add1Passanger(){
        this.numberOfPassangerNow += 1;
    }
    public void remove1Passanger(){
        this.numberOfPassangerNow -= 1;
    }
    public void removeAllPassanger(){
        this.numberOfPassangerNow = 0;
    }
    public  CarDoor getDoorforIndex(int index){
        return otherCarDoor[index];
    }
    public  CarWheel getWheelforIndex(int index){
        return otherCarwheel[index];
    }
    public void removeAllWheels(){
        for (CarWheel i : otherCarwheel) {
            otherCarwheel = null;

        }
    }
}

