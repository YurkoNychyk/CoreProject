package main.java.goit.group3;

public class Runner {
    public static void main(String[] args) {

//        String test = "1234568789545565";
//        int [] test2 = {-1,2,3,5,4};
//        long test3 = 1234568789545565L;
        boolean result;

        boolean repeat = true;

        while (repeat) {
            try {
                result = LuhnAlgorithm.cardNumberIsValid(Console.readData("Введіть, будь ласка 16 цифр номеру карти",16));
                Console.writeResult(result);
                repeat =!result;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
