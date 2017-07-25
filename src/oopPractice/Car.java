package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class Car {
    private int count = 0;
    CarWheel[] otherCarwheel;
    CarDoor[] otherCarDoor;
    private int[] dateOfManufacture = new int[3];
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
    public void removeAllWheels() {
        for (int i=0; i < otherCarwheel.length; i++) {
            otherCarwheel[i].setTireState(0);
        }
    }
    public int numberOfWheels(){
        for (int i =0; i<otherCarwheel.length; i++)
        {
            if (otherCarwheel[i].getTireState() > 0){
                count ++;
            }
        }
        return count;
    }
 /*  public CarWheel[] addNewWheels(int index){

    otherCarwheel.length + index
    }
 /*   public int currentMaxSpeed (){
        int maxErasedWheel = otherCarwheel[]
        for
    }
    */
     public void showInfoCar(){
         System.out.println("Дата виробництва " + dateOfManufacture[0] +", місяць виробництва " + dateOfManufacture[1] + " , рік виробництва " + dateOfManufacture[2]);
         System.out.println("Тип двигуна " + typeOfEngine);
         System.out.println("Максимальна швидкість" + maxSpeedOfCar);
         System.out.println("Час розгону " + accelerationTime);
         System.out.println("Загальна Кількість пасажирів " + numberOfPassanger);
         System.out.println("Поточна кількість пасажирів " + numberOfPassangerNow);
         System.out.println("Поточна швидкість " + currentSpeed);
         System.out.println("Кількість колес в машині " + numberOfWheels());

 }
}

