package Model;

import java.util.Scanner;

public class Notepad {

    private int chooseDo;

    Scanner sc = new Scanner(System.in);

    public void startNotepad() {
        System.out.println("Что вы хотите сделать?: \n 1. Прочитать запись. \n 2. Сделать запись. \n 3. Выйти.");
        chooseDo = sc.nextInt();
        switch (chooseDo) {
            case 1 -> {
                readText();
                break;
            }
            case 2 -> {
                writeText();
                break;
            }

            case 3 -> {
                Programms startProgramms = new Programms();
                startProgramms.chooseProgramm();
                break;
            }
            default -> {
                System.out.println("Вы вышли за пределы выбора! Попробуйте заного!");
                startNotepad();
                break;
            }
        }
    }

    public void writeText() {
        //ToDo запись текста

        startNotepad();
    }

    public void readText() {
        //ToDo получение текста

        startNotepad();
    }
}
