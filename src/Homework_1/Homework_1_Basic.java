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
        double height = 1.81;
        int weight = 63;
        double indexHuman = height / (weight * weight);
        String indexHumanProper = String.format("Мой индекс - %.6f", 4.560342655580751E-4);
        System.out.println(indexHumanProper);
    }
}
