package Model;

import java.util.Scanner;

public class Calculator {

    private float firstNumber;
    private float secondNumber;

    private int chooseOperation;

    private boolean maxNumber = false;
    private boolean calculatorExit = false;

    public void startCalculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберете, какую операцию хотите выполнить: \n 1. Сложение \n 2. Вычитание \n " +
                "3. Умножение \n 4. Диление \n 5. Всё вместе \n 6. Выйти");
        chooseOperation = sc.nextInt();

        switch (chooseOperation) {

            case 1 -> {
                summa();
                break;
            }

            case 2 -> {
                raznost();
                break;
            }

            case 3 -> {
                proizvedenie();
                break;
            }

            case 4 -> {
                chastnoe();
                break;
            }

            case 5 -> {
                vseVmeste();
                break;
            }

            case 6 -> {
                break;
            }

            default -> {
                System.out.println("Вы вышли за пределы выбора! Попробуйте заного!");
                startCalculator();
            }
        }
        Programms startProgramms = new Programms();
        startProgramms.chooseProgramm();
    }

    private void summa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextFloat();
        System.out.println("Сумма ваших чисел равна -> " + (firstNumber + secondNumber) + "!");
        startCalculator();
    }

    private void raznost() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextFloat();
        System.out.println("Разность ваших чисел равна -> " + (firstNumber - secondNumber) + "!");
        startCalculator();
    }

    private void proizvedenie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextFloat();
        System.out.println("Произведение ваших чисел равно -> " + (firstNumber * secondNumber) + "!");
        startCalculator();
    }

    private void chastnoe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextFloat();
        System.out.println("Частное ваших чисел равно -> " + (firstNumber / secondNumber) + "!");
        startCalculator();
    }

    private void vseVmeste() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextFloat();
        System.out.println(" Сумма ваших чисел равна: " + (firstNumber + secondNumber) + "! \n Разница" +
                " ваших чисел равна: " + (firstNumber - secondNumber) + "! \n Произведение ваших чисел" +
                " равно: " + (firstNumber * secondNumber) + "! \n Частное ваших чисел равно: " +
                (firstNumber / secondNumber) + "!");
        startCalculator();
    }
}
