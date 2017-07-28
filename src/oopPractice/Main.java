package oopPractice;
import java.util.Scanner;
/**
 * Created by user22 on 25.07.2017.
 */
public class Main {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        Car ferrari = new Car(28, 12, 1989, "електричний двигун", 350, 10.5f, 6, 2, 60);
        System.out.println("Сколько колес будет у машини");
        int numberOfTires = sc.nextInt();
        ferrari.otherCarwheel = new CarWheel[numberOfTires];
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            ferrari.otherCarwheel[i] = new CarWheel(1);
        }
        //Ініціалізація чотирьох дверцят та дверей
        ferrari.otherCarDoor = new CarDoor[4];
        for (int i =0; i<ferrari.otherCarDoor.length; i++) {
            ferrari.otherCarDoor[i] = new CarDoor();
        }

        while (true) {

            //public Car(int date, int month, int year, String typeOfEngine, int maxSpeedOfCar, float accelerationTime, int numberOfPassanger, int numberOfPassangerNow, int currentSpeed){
            while (true) {
                try {

                    while (true) {
                        System.out.println("\nЩо ви плануєте робити?:\n 1 - Змінити поточну швидкість авто\n 2 - Додати одного пасажира в авто \n 3 - Висадити одного пасажира з авто\n" +
                                " 4 - Висадити всіх пасажирів з авто\n 5 - Зняти всі колеса з авто \n 6 - Встановити на машину N - колес\n" +
                                " 7 - Обрахувати поточну швидкість\n 8 - Вивести дані стосовно авто\n 9 - Відчинити або зачинити дверцята за індексом та переглянути їх стан\n" +
                                " 10 - Відчинити або зачинити вікно за іцдексом та переглянути їх стан\n 11 - Завершити роботу програми" );
                        choice = sc.nextInt();
                        if (choice >= 1 && choice <= 11) {
                            break;
                        }

                    }
                    break;

                } catch (Exception e) {
                    System.out.println("Ви ввели невірне значення.");
                    sc.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Задайте швидкість авто");
                    int currentSpeed = sc.nextInt();
                    ferrari.changeCurrentSpeed(currentSpeed);
                    break;
                case 2:
                    System.out.println("В авто додано одного пасажира!");
                    ferrari.add1Passanger();
                    break;
                case 3:
                    if (ferrari.NumberOfPassangerNow() == 0) System.out.println("Неможливо нікого висадити. В машині нікого немає!!!");
                    else {
                        System.out.println("З машини висаджено одного пасажира");
                        ferrari.remove1Passanger();}
                    break;
                case 4:
                    if (ferrari.NumberOfPassangerNow() == 0) System.out.println("Неможливо нікого висадити. В машині нікого немає!!!");
                    else {
                        System.out.println("З машини висаджено всіх пасажирів");
                        ferrari.removeAllPassanger();}
                    break;
                case 5:
                    ferrari.removeAllWheels();
                    System.out.println("Ви зняли усі колеса...");
                    break;
                case 6:
                    System.out.println("Скільки колес ви бажаєте встановити?");
                    int numberOfIncomingWheels = sc.nextInt();
                    ferrari.addNewWheels(numberOfIncomingWheels);
                    break;
                case 7:
                    System.out.println("Поточно максимальна швадкість авто буде дорівнювати - " + ferrari.currentMaxSpeed() + " ");
                    break;
                case 8:
                    System.out.println("Виведжу дані стосовно авто...");
                    ferrari.showInfoCar();
                    break;
                case 9:
                    while (true) {
                        try {

                            while (true) {
                                System.out.println("Введіть номер вікна від 1 до 4 або натисність 5 щоб переглянути стан дверцят та 6 для виходу у верхнє меню" );
                                int choiceDoor = sc.nextInt();
                                if (choiceDoor >= 1 && choiceDoor <= 4) {
                                    ferrari.otherCarDoor[choiceDoor-1].openCloseDoor();
                                    System.out.println("Стан дверцят номер " + choiceDoor + " змінено...");
                                }
                                else if (choiceDoor == 5){
                                    for (int i = 0; i <ferrari.otherCarDoor.length; i++){
                                        if (ferrari.otherCarDoor[i].getDoorState() == true)
                                            System.out.println("Віконце за номером " + (i+1) + " відчинені" );
                                        else System.out.println("Віконце за номером " + (i+1) + " зачинені");
                                    }
                                }
                                else break;

                            }
                            break;

                        } catch (Exception e) {
                            System.out.println("Ви ввели невірне значення.");
                            sc.nextLine();
                        }
                    }
                    break;
                case 10:
                    while (true) {
                        try {

                            while (true) {
                                System.out.println("Введіть номер вікна від 1 до 4 або натисність 5 щоб переглянути стан дверцят та 6 для виходу у верхнє меню" );
                                int choiceWindow = sc.nextInt();
                                if (choiceWindow >= 1 && choiceWindow <= 4) {
                                    ferrari.otherCarDoor[choiceWindow-1].openCloseWindow();
                                    System.out.println("Стан вікна номер " + choiceWindow + " змінено...");
                                }
                                else if (choiceWindow == 5){
                                    for (int i = 0; i <ferrari.otherCarDoor.length; i++){
                                        if (ferrari.otherCarDoor[i].getWindowState() == true)
                                            System.out.println("Віконце за номером " + (i+1) + " відчинено" );
                                        else System.out.println("Віконце за номером " + (i+1) + " зачинено");
                                    }
                                }
                                else break;

                            }
                            break;

                        } catch (Exception e) {
                            System.out.println("Ви ввели невірне значення.");
                            sc.nextLine();
                        }
                    }
                    break;
                case 11:
                    System.out.println("Програма завершила своє функціонування!");
                    return;
                    }
              }
        }

    }

