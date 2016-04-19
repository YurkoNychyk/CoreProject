package main.java.goit.group3;

public class LuhnAlgorithm {

    // for int[] data
    public static boolean cardNumberIsValid(int[] ints) throws NumberFormatException {

        if (!isOnlyPositive(ints)) {
            throw new NumberFormatException("Digits, be positive! :)");
        }

//        for (int i = ints.length - 2; i >= 0; i = i - 2) {
//           int j = ints[i];
//           j = j * 2;
//           if (j > 9) {
//                 j = j % 10 + 1;
//               }
//                ints[i] = j;
//        }
//        int sum = 0;
//        for (int i = 0; i < ints.length; i++) {
//             sum += ints[i];
//        }
//        return sum % 10 == 0;

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

//    //for String data
//    public static boolean cardNumberIsValid(String number) throws NumberFormatException {
//        long temp;
//        try {
//            temp = Long.parseLong(number);
//        } catch (NumberFormatException e) {
//            throw new NumberFormatException("Only numeric symbols should be here.");
//        }
//
//        int[]digits = Long.toString(temp).chars().map(c -> c-='0').toArray();
//        return cardNumberIsValid(digits);
////        String reverse = new StringBuilder().append(number).reverse().toString();
////        int sum = 0;
////        for (int i = 0; i < number.length(); i++) {
////            int digit = Integer.parseInt("" + reverse.charAt(i));
////            if (i % 2 == 1) { //cuz we have a reverse here
////                digit *= 2;
////                if (digit > 9) {
////                    digit -= 9;
////                }
////            }
////            sum += digit;
////        }
////        return sum % 10 == 0;
//    }

    //for int data
//    public static boolean cardNumberIsValid(Long number) throws NumberFormatException {
//        int[]digits = Long.toString(number).chars().map(c -> c-='0').toArray();
//        return cardNumberIsValid(digits);
//    }

    private static boolean isOnlyPositive(int[] ints) {
        for (int i = 0; i < ints.length-1; i++)
            if (ints[i] < 0)
                return false;
        return true;
    }
}

