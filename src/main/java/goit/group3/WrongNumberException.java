package main.java.goit.group3;

public class WrongNumberException extends IllegalArgumentException {

    public WrongNumberException(String massege) {
        super(massege);
    }

//    private boolean isOnlyPositive(int[] ints) {
//
//        for (int i = 0; i < ints.length; i++)
//            if (i < 0)
//                return false;
//        return true;
//    }
}
