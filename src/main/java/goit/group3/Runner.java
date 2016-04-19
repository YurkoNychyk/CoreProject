package main.java.goit.group3;

public class Runner {
    public static void main(String[] args) {

//        String test = "1234568789545565";
//        int [] test2 = {-1,2,3,5,4};
//        long test3 = 1234568789545565L;
        boolean result;

        boolean quit = false;

        while (!quit) {
            try {
                result = LuhnAlgorithm.cardNumberIsValid(Console.readData("Введіть, будь ласка 16 цифр номеру карти для перевірки",16));
                Console.writeResult(result);
                while (true){
                    if (Console.readString("\n - Щоб перевірити наступний номер натисніть  \"Enter\". \n - Для виходу введіть \"q\" та натисніть \"Enter\" ").equals("q"))
                        quit = true;
                        break;
                }


            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
