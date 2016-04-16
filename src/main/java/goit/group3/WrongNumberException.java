package main.java.goit.group3;

public class WrongNumberException extends IllegalArgumentException {

    public WrongNumberException(String number) {
      super("Only numeric symbols should be here");
    }
}
