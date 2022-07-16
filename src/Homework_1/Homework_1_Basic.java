//Базовый уровень
package Homework_1;

import java.text.DecimalFormat;
import java.util.Locale;

public class Homework_1_Basic {
    public static void main(String[] args) {
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String hey = hi.trim();
        String worldSmall = world.toLowerCase();
        String result = hey + worldSmall + newLine;
        String resultMulti = result.repeat(3);
        System.out.println(resultMulti);

        //Задача №2
        float height = 1.81f;
        int weight = 63;
        float indexHuman = height / (weight * weight);
        System.out.printf("Мой индекс массы тела - %.6f", indexHuman);

        //Задача №3
        char[] alphabet = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(alphabet);
        alphabet[3] = 'h';
        System.out.println(alphabet);
    }
}
