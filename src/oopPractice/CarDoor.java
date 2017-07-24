package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class CarDoor {
    private boolean isopenClosedDoor;
    private boolean isOpenClosedWindow;

    public CarDoor() {
        this.isopenClosedDoor = false;
        this.isOpenClosedWindow = false;
    }
    public CarDoor(boolean isopenClosedDoor, boolean isOpenClosedWindow) {
        this.isopenClosedDoor = isopenClosedDoor;
        this.isOpenClosedWindow = isOpenClosedWindow;
    }
    public void openCloseDoor(){
        if (this.isopenClosedDoor == false){
            this.isopenClosedDoor = true;
        }
        else if (this.isopenClosedDoor == true){
            this.isopenClosedDoor = false;
        }
    }
    public void openCloseWindow(){
        if (this.isOpenClosedWindow == false){
            this.isOpenClosedWindow = true;
        }
        else if (this.isOpenClosedWindow == true){
            this.isOpenClosedWindow = false;
        }
    }
    public void showInfo(){
        if (isopenClosedDoor = false) {
            System.out.println("Дверцята в машині зачинені" );
        }
        else if (isopenClosedDoor = true){
            System.out.println("Дверцята в машині відчинені" );
        }
        if (isOpenClosedWindow = false) {
            System.out.println("Вікно в машині зачиненено" );
        }
        else if (isOpenClosedWindow = true){
            System.out.println("Вікно в машині відчинено" );
        }
    }
}
