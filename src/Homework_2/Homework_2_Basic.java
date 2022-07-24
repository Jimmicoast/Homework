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
        //Задача №3
        boolean chicken = true;
        boolean vegetables = false;
        boolean sauce = true;
        boolean toasts = true;
        boolean sausage = true;
        boolean eggs = true;
        boolean Ceasar = chicken && vegetables && sauce && toasts;
        boolean Olivie = vegetables && (chicken || sausage) && eggs;
        boolean vegetableSalad = vegetables;
        if (boolean Ceasar = chicken && vegetables && sauce && toasts) {
            System.out.println("Приготовим Цезарь");
        }
        else if (boolean Olivie = vegetables && (chicken || sausage) && eggs) {
            System.out.println("Приготовим Оливье");
        }
        else if (boolean vegetableSalad = vegetables) {
            System.out.println("Приготовим овощной салат");
        }
        else {
            System.out.println("Ингридиентов нет, голодная смерть");
        }

    }

}
