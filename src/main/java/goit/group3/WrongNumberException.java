package main.java.goit.group3;

public class WrongNumberException extends IllegalArgumentException {

    public WrongNumberException(String number) {
        super("Number "+number+" is not correct"+
                "\nOnly numeric symbols should be here.");
    }
    public WrongNumberException() {
        super("Number should contain 16 digits.");
    }

//    private boolean isOnlyPositive(int[] ints) {
//
//        for (int i = 0; i < ints.length; i++)
//            if (i < 0)
//                return false;
//        return true;
//    }
}
