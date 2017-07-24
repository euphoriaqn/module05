package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class CarWheel {
    private float tireState;
    public CarWheel() {
        this.tireState = 1f;
    }
    public CarWheel(float tireState) {
        this.tireState = tireState;
    }
    public void changeTire(){
        this.tireState = 1f;
    }
    public void eraseTire(int eraseProcent){
        this.tireState = tireState - (eraseProcent/100);
    }
    public float getTireState(){
        return this.tireState;
    }
    public void showInfoCarWheel(){
        System.out.println("Цілісність шини складає " + tireState + " від '1'");
    }

}
