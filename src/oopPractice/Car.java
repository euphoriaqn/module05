package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class Car {
    CarWheel[] otherCarwheel;
    CarDoor[] otherCarDoor;
    private int[] dateOfManufacture = new int[3];
    private String typeOfEngine;
    private int maxSpeedOfCar;
    private float accelerationTime;
    private int numberOfPassanger;
    private int numberOfPassangerNow;
    private int currentSpeed;
    public Car(int date, int month, int year) {
        this.dateOfManufacture[0] = date;
        this.dateOfManufacture[1] = month;
        this.dateOfManufacture[2] = year;
    }
    public Car(int date, int month, int year, String typeOfEngine, int maxSpeedOfCar, float accelerationTime, int numberOfPassanger, int numberOfPassangerNow, int currentSpeed){
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
    public int NumberOfPassangerNow(){return numberOfPassangerNow;}
    public void removeAllWheels() {
        for (int i=0; i < otherCarwheel.length; i++) {
            otherCarwheel[i].setTireState(0);
        }
    }
    public int numberOfWheels(){
        int count = 0;
        for (int i =0; i<otherCarwheel.length; i++)
        {
            if (otherCarwheel[i].getTireState() > 0){
                count ++;
            }
        }
        return count;
    }
    public int numberOfDestroyedWheels(){
        int countDestroyedWheel = 0;
        for (int i =0; i<otherCarwheel.length; i++)
        {
            if (otherCarwheel[i].getTireState() == 0) countDestroyedWheel++;
        }
        return countDestroyedWheel;
    }
    public void addNewWheels(int index){

    CarWheel[] newOtherCarwheel= new CarWheel[this.otherCarwheel.length+index];
        for(int i = 0; i < otherCarwheel.length; i++)
            newOtherCarwheel[i] = otherCarwheel[i];
    for (int i =otherCarwheel.length; i <newOtherCarwheel.length; i ++)
    {newOtherCarwheel[i] = new CarWheel(1);}
    this.otherCarwheel = newOtherCarwheel;
    }
    public int currentMaxSpeed () {
        int currentmaxSpeed;
        double mostErasedWheel = otherCarwheel[0].getTireState();
        if (numberOfPassangerNow == 0) currentmaxSpeed = 0;
        else {
            for (int i = 0; i < otherCarwheel.length; i++) {
                if (otherCarwheel[i].getTireState() < mostErasedWheel) {
                    mostErasedWheel = otherCarwheel[i].getTireState();
                }

            }
            currentmaxSpeed = (int)(maxSpeedOfCar*mostErasedWheel);
                   }
        return currentmaxSpeed;
    }
    public void showInfoCarWheel(){
        for (int i = 0; i <otherCarwheel.length; i++){

        }
    }
    public void showInfoCar(){
         System.out.println("Дата виробництва - " + dateOfManufacture[0] +", місяць виробництва - " + dateOfManufacture[1] + " , рік виробництва - " + dateOfManufacture[2]);
         System.out.println("Тип двигуна - " + typeOfEngine);
         System.out.println("Максимальна швидкість - " + maxSpeedOfCar);
         System.out.println("Час розгону - " + accelerationTime);
         System.out.println("Загальна кількість пасажирів - " + numberOfPassanger);
         System.out.println("Поточна кількість пасажирів - " + numberOfPassangerNow);
         System.out.println("Поточна швидкість - " + currentSpeed);
         System.out.println("Кількість цілих колес в машині - " + numberOfWheels() + ", з них повністю стертих колес - " + numberOfDestroyedWheels());
         System.out.println("Поточна можлива максимальна швидкість з урахуванням зтертості шин - " + currentMaxSpeed());
 }
}

