package Model;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    private int min;
    private int max;
    private int chooseDo;

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public void startRandom() {
        System.out.println("Что вы хотите сделать? \n 1. Сгенерировать одно число \n 2. Сгенерировать пять чисел. \n" +
                " 3. Сгенерироывать десять чисел. \n 4. Выйти.");
        chooseDo = sc.nextInt();
        switch (chooseDo) {
            case 1 -> {
                System.out.println("От какого числа генерировать числа?");
                min = sc.nextInt();
                System.out.println("До какого числа генерировать числа?");
                max = sc.nextInt();
                max++;

                rand.ints(1, min, max).sorted().forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("От какого числа генерировать числа?");
                min = sc.nextInt();
                System.out.println("До какого числа генерировать числа?");
                max = sc.nextInt();
                max++;

                rand.ints(5, min, max).sorted().forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("От какого числа генерировать числа?");
                min = sc.nextInt();
                System.out.println("До какого числа генерировать числа?");
                max = sc.nextInt();
                max++;

                rand.ints(10, min, max).sorted().forEach(System.out::println);
            }
        }
        startRandom();
    }
}
