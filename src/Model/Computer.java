package Model;

import Model.Password;

public class Computer {
    public void startComputer() {
        System.out.println("Компьютер включен!");
        Password start = new Password();
        start.enterPassword();
    }
}
