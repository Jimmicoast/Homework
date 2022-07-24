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
        boolean vegetables = true;
        boolean sauce = false;
        boolean toasts = true;
        boolean sausage = false;
        boolean eggs = true;
        boolean Ceasar = chicken && vegetables && sauce && toasts;
        boolean Olivie = vegetables && (chicken || sausage) && eggs;
        if (Ceasar) {
            System.out.println("Приготовим Цезарь");
        }
        else if (Olivie) {
            System.out.println("Приготовим Оливье");
        }
        else if (vegetables) {
            System.out.println("Приготовим овощной салат");
        }
        else {
            System.out.println("Ингредиентов нет");
        }
        //Задача №4
        Weasel sneaky = new Weasel("Sneaky", 4, 210);
        System.out.println("хорек по имени " + sneaky.nickname);
        System.out.println("возраст хорька - " + sneaky.age);
        System.out.println("вес хорька - " + sneaky.weight);

        sneaky.makeSound();
        sneaky.setNickname("Fluffy");
        String weaselNickname = sneaky.getNickname();
        sneaky.setAge(5);
        int weaselAge = sneaky.getAge();
        sneaky.setWeight(235);
        int weaselWeight = sneaky.getWeight();
        System.out.println("хорек по имени " + sneaky.nickname);
        System.out.println("возраст хорька - " + sneaky.age);
        System.out.println("вес хорька - " + sneaky.weight);

        Parrot kesha = new Parrot("Kesha", 7, 650);
        System.out.println("имя попугая - " + kesha.nickname);
        System.out.println("возраст попугая - " + kesha.age);
        System.out.println("вес попугая - " + kesha.weight);

        kesha.sayHi();
        kesha.setNickname("Gosha");
        String parrotNickname = kesha.getNickname();
        kesha.setAge(10);
        int parrotAge = kesha.getAge();
        kesha.setWeight(770);
        int parrotWeight = kesha.getWeight();
        System.out.println("имя попугая - " + kesha.nickname);
        System.out.println("возраст попугая - " + kesha.age);
        System.out.println("вес попугая - " + kesha.weight);
    }

}
