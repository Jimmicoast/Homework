package Homework_2;

public class Homework_2_Basic {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        for (int i = 1; i < 101; i = i +1) {
            System.out.print(i + "a" + " ");
        }
        //Задача №2
        int ageChildren = 10;
        if (ageChildren < 6) {
            System.out.println("\nРебенок пошел в детский сад");
        }
        else if (ageChildren >= 6 && ageChildren < 11) {
            System.out.println("\nРебенок пошел в младшую школу");
        } else if (ageChildren >= 11 && ageChildren < 17) {
            System.out.println("\nРебенок пошел в среднюю школу");
        }
        else {
            System.out.println("\nРебенок пошел в университет");
        }

    }

}
