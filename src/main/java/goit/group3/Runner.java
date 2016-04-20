package main.java.goit.group3;

public class Runner {
    
    public static void main(String[] args) {
        
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
