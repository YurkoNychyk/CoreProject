package main.java.goit.group3;

public class LuhnAlgorithm {


    public static boolean cardNumberIsValid(int[] ints) throws NumberFormatException {

        if (!isOnlyPositive(ints)) {
            throw new NumberFormatException("Digits, be positive! :)");
        }


        int sum = 0;
        boolean even = false;
        for (int i = ints.length - 1; i >= 0; i--) {
            int digit = ints[i];
            if (even) {
                if ((digit *= 2) > 9) digit -= 9;
            }
            sum += digit;
            even = !even;
        }
        return sum % 10 == 0;

    }



    private static boolean isOnlyPositive(int[] ints) {
        for (int i = 0; i < ints.length-1; i++)
            if (ints[i] < 0)
                return false;
        return true;
    }
}

