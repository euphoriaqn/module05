package oopPractice;
import java.util.Scanner;
/**
 * Created by user22 on 25.07.2017.
 */
public class Main {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        Car ferrari = new Car(28, 12, 1989, "електрический двигатель", 350, 10.5f, 6, 2, 60);
        System.out.println("Сколько колес будет у машини");
        int numberOfTires = sc.nextInt();
        ferrari.otherCarwheel = new CarWheel[numberOfTires];
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            ferrari.otherCarwheel[i] = new CarWheel(1);
        }
        while (true) {

            //public Car(int date, int month, int year, String typeOfEngine, int maxSpeedOfCar, float accelerationTime, int numberOfPassanger, int numberOfPassangerNow, int currentSpeed){
            while (true) {
                try {

                    while (true) {
                        System.out.println("\nЩо ви плануєте робити?:\n 1 - Змінити поточну швидкість авто\n 2- Додати одного пасажира в авто \n 3 - Висадити одного пасажира з авто\n" +
                                " 4 - Висадити всіх пасажирів з авто\n 5 - Отримати дверцята згідно індексу\n 6 - Отримати дверцята згідно індексу \n 7 - Зняти всі колеса з авто \n 8 - Встановити на машину N - колес\n" +
                                " 9 - Обрахувати поточну швидкість\n 10 - Вивести дані стосовно авто\n 11 - Перейти в меню дверцят\n 12 - Перейти в меню вікон" );
                        choice = sc.nextInt();
                        if (choice >= 1 && choice <= 12) {
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
                    System.out.println("Виконується задача №1....");
                    System.out.println("Введите число X:");
                    int x = sc.nextInt();
                    Numbers(x);
                    break;
                case 2:
                    System.out.println("Виконується задача №2....");
                    System.out.println("Введіть ширину:");
                    int a = sc.nextInt();
                    System.out.println("Введіть висоту:");
                    int b = sc.nextInt();
                    drawRectangle(a, b);
                    break;
                case 3:
                    System.out.println("Виконується задача №3....");
                    System.out.println("Будем рисовать прямоугольник или квадрат? 1 - прямоугольник, 2 - квадрат");
                    int choiceX = sc.nextInt();
                    while (choiceX !=1 && choiceX!=2) {
                        System.out.println("Ви ввели невірне значення. Введіть значення повторно: 1 - прямоугольник, 2 - квадрат");
                        choiceX = sc.nextInt();
                    }
                    switch(choiceX) {
                        case 1:
                            System.out.println("Введіть ширину:");
                            int width = sc.nextInt();
                            System.out.println("Введіть висоту:");
                            int height = sc.nextInt();
                            drawRectangle(width, height);
                            break;
                        case 2:
                            System.out.println("Введіть ширину:");
                            int width2 = sc.nextInt();
                            drawRectangle(width2);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Виконується задача №4....");
                    System.out.println("Які числа ви будете вводити? Цілі чи дробні?   1 - цілі, 2 - дробні");
                    int choice4 = sc.nextInt();
                    switch(choice4) {
                        // Логіка коли користувач вибрав цілі числа
                        case 1:
                            int intX;
                            int intY;
                            while (true) {
                                try {
                                    System.out.println("Введите целое число X:");
                                    intX = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    sc.nextLine();
                                }
                            }
                            while (true) {
                                try {
                                    System.out.println("Введите целое число Y:");
                                    intY = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    sc.nextLine();
                                }
                            }
                            int maxInt = getMax(intX, intY);
                            System.out.println("Максимальне значення серед цілих чисел " + intX + " та " + intY + " буде " + maxInt );
                            break;
                        // Логіка коли користувач вибрав дробні числа
                        case 2:
                            double doubleX;
                            double doubleY;
                            while (true) {
                                try {
                                    System.out.println("Введите дробное число X:");
                                    doubleX = sc.nextDouble();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    sc.nextLine();
                                }
                            }
                            while (true) {
                                try {
                                    System.out.println("Введите дробное число Y:");
                                    doubleY = sc.nextDouble();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    sc.nextLine();
                                }
                            }
                            double maxDouble = getMax(doubleX, doubleY);
                            System.out.println("Максимальне значення серед цілих чисел " + doubleX + " та " + doubleY + " буде " + maxDouble );
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Виконується задача №5....");
                    System.out.println("Введите число X:");
                    int x5 = sc.nextInt();
                    Numbers2(x5);
                    break;
                case 6:
                    System.out.println("Виконується задача №6....");
                    System.out.println("Введіть ширину:");
                    int x6 = sc.nextInt();
                    System.out.println("Введіть висоту:");
                    int y = sc.nextInt();
                    int tmp = x6;
                    drawRectangle(x6, y, tmp);
                    break;
                case 7:
                    return;
            }
        }

    }

    public static void Numbers(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
    }
    public static void drawRectangle(int width, int height){
        for (int i =0; i<height; i++){
            for (int j =0; j<width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    //Функція визначення максимального числа серед цілих чисел
    public static int getMax(int x, int y){
        int max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
    //Функція вихначення максимального числа серед дробних чисел
    public static double getMax(double x, double y){
        double max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
    public static int Numbers2(int x){
        int result;
        if (x==1) {
            System.out.print(x + " ");
            return 1;
        }
        result = Numbers2(x-1)*x;
        System.out.print(x + " ");
        return result;
    }
    public static void drawRectangle(int width, int height, int tmp){

        if (height == 1) {
            if (width == 1) {
                System.out.print("+");
                return;
            }
            else {
                System.out.print("+");
                drawRectangle(width - 1, height, tmp);
                return;
            }

        }
        if (width == 1) {
            System.out.print("+");
            System.out.println();
            width = tmp;
            drawRectangle(width, height -1, tmp);
            return;
        }
        else {
            System.out.print("+");
            drawRectangle(width - 1, height, tmp);
            return;
        }




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
      //  System.out.println("Введите количество колес в машине");
     //   int x = sc.nextInt();
        Car ferrari = new Car(28, 12, 1989, "електрический двигатель", 350, 10.5f, 6, 2, 60);
        System.out.println("Сколько колес будет у машини");
        int numberOfTires = sc.nextInt();
        ferrari.otherCarwheel = new CarWheel[numberOfTires];
        for (int i =0; i<ferrari.otherCarwheel.length; i++) {
            ferrari.otherCarwheel[i] = new CarWheel(1);
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
        ferrari.addNewWheels(3);
        ferrari.showInfoCar();
        ferrari.addNewWheels(10);
        ferrari.showInfoCar();

    }


}
