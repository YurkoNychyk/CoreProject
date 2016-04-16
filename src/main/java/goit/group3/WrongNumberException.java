package main.java.goit.group3;

public class WrongNumberException extends IllegalArgumentException {

    public WrongNumberException(String number) {
        super("Number "+number+" is not correct"+
                "\nOnly numeric symbols should be here.");
    }
    public WrongNumberException() {
        super("Number should contain 16 digits.");
    }
}
