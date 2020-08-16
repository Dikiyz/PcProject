package Model;

import java.util.Scanner;

public class Password {

    private boolean passwordIsTrue = false;

    private String password = "1";
    private String inputPassword;
    private String yesOrNot;
    private String Y = "Y";
    private String Yes = "Yes";
    private String N = "N";
    private String No = "No";

    Scanner sc = new Scanner(System.in);

    public void enterPassword() {
        while (!passwordIsTrue) {
            System.out.println("Введите пароль «" + password + "» ниже.");
            inputPassword = sc.nextLine();
            if (inputPassword.equals(password)) {
                System.out.println("Пароль введен верно! Добро пожаловать!");
                passwordIsTrue = true;
                changeOrNot();
            } else {
                System.out.println("Пароль введен не верно, попробуйте заново!");
            }
        }
    }

    public void changeOrNot() {
        System.out.println("Хотите изменить пароль? Y(Yes)/N(No).");
        yesOrNot = sc.nextLine();
        if (yesOrNot.equalsIgnoreCase(Y) || yesOrNot.equalsIgnoreCase(Yes)) {
            changePassword();
        } else if (yesOrNot.equalsIgnoreCase(N) || yesOrNot.equalsIgnoreCase(No)) {
            Programms start = new Programms();
            start.chooseProgramm();
        } else {
            System.out.println("Введите ответ корректно!");
            changeOrNot();
        }
    }

    public void changePassword() {
        System.out.println("Введите новый пароль ниже!");
        String newPassword = sc.nextLine();
        password = newPassword;
        System.out.println("Пароль успешно изменен на «" + newPassword + "»!");
        Programms start = new Programms();
        start.chooseProgramm();
    }
}
