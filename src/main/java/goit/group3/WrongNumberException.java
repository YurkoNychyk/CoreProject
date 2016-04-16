package main.java.goit.group3;

public class WrongNumberException extends IllegalArgumentException {

    public static boolean WrongNumberException(String number) {

         {
            int extraChars = number.length() - 16;
            if (extraChars != 0) {
                throw new IllegalArgumentException("Number length should be 16 characters!!");
            }
            return true;
        }

    }
}
