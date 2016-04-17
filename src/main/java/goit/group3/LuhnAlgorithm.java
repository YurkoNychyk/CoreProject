package main.java.goit.group3;

public class LuhnAlgorithm {

    // for int[] data
    public static boolean validateNumber(int[] ints) throws IllegalArgumentException {

        if (!isOnlyPositive(ints)) {
            throw new IllegalArgumentException("Digits, be positive! :)");
        }

        for (int i = ints.length - 2; i >= 0; i = i - 2) {
           int j = ints[i];
           j = j * 2;
           if (j > 9) {
                 j = j % 10 + 1;
               }
                ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
             sum += ints[i];
        }
        return sum % 10 == 0;
    }

    //for String data
    public static boolean validateNumber(String number) throws IllegalArgumentException {

        int temp = Integer.parseInt(number);
        int[]digits = Integer.toString(temp).chars().map(c -> c-='0').toArray();
        return validateNumber(digits);
//        String reverse = new StringBuilder().append(number).reverse().toString();
//        int sum = 0;
//        for (int i = 0; i < number.length(); i++) {
//            int digit = Integer.parseInt("" + reverse.charAt(i));
//            if (i % 2 == 1) { //cuz we have a reverse here
//                digit *= 2;
//                if (digit > 9) {
//                    digit -= 9;
//                }
//            }
//            sum += digit;
//        }
//        return sum % 10 == 0;
    }

    //for int data
    public static boolean validateNumber(int number) throws IllegalArgumentException {
        int[]digits = Integer.toString(number).chars().map(c -> c-='0').toArray();
        return validateNumber(digits);
    }

    private static boolean isOnlyPositive(int[] ints) {
        for (int i = 0; i < ints.length; i++)
            if (i < 0)
                return false;
        return true;
    }

//    private static boolean isOnlyPositive(int number) {
//        int[]digits = Integer.toString(number).chars().map(c -> c-='0').toArray();
//        for(int d : digits) {
//            if (d<0) return false;
//        }
//        return true;
//    }

}

