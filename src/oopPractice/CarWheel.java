package oopPractice;

/**
 * Created by user22 on 24.07.2017.
 */
public class CarWheel {
    private float tireState;
    public CarWheel() {
        this.tireState = 1;
    }
    public CarWheel(float tireState) {
        this.tireState = tireState;
    }
    public void changeTire(){
        this.tireState = 1f;
    }
    public void eraseTire(int eraseProcent){
        float diffOFTireErase = this.tireState - ((float)eraseProcent/100.0f);
        if (diffOFTireErase < 0) System.out.println("Ви ризикуєте почати стирати диски!Зупиністься!!!");
        else this.tireState = diffOFTireErase;
    }
    public float getTireState(){
        return this.tireState;
    }
    public void setTireState(float tireState){
        this.tireState = tireState;
    }
    public void showInfoCarWheel(){
        System.out.println("Цілісність шини складає " + tireState + " від '1'");
    }

}
