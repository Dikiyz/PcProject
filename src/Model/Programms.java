package Model;

import java.util.Scanner;

public class Programms {

    private int chooseDo;

    Scanner sc = new Scanner(System.in);

    public void chooseProgramm() {
        System.out.println("Выберете, какую программу хотите открыть: \n 1. Калькулятор. \n 2. Блокнот. \n" +
                " 3. Рандомайзер.");
        chooseDo = sc.nextInt();
        switch (chooseDo) {

            case 1 -> {
                Calculator startCalculator = new Calculator();
                startCalculator.startCalculator();
            }

            case 2 -> {
                Notepad startNotepad = new Notepad();
                startNotepad.startNotepad();
            }

            case 3 -> {
                RandomGenerator startRandom = new RandomGenerator();
                startRandom.startRandom();
            }

            default -> {
                System.out.println("Вы вышли за пределы выбора, пожалуйста выберете заного!");
                chooseProgramm();
            }
        }
    }
}
