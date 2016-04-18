package main.java.goit.group3;

import java.util.Scanner;

public class Console {
    private static Scanner consoleReader;
   /**
    * @param  welcomeString string that will be printed in console before user input
    * @param  argsNumber size of returned array
    * @return array of ints, found in user input string
    */
    public static int[] readData(String welcomeString,int argsNumber) {
        int[] args = new int[argsNumber];
        StringBuffer inputstring= new StringBuffer("");
        int digitsLeft=16;

        System.out.println(welcomeString );

        while (true) {
            try {
                consoleReader = new Scanner(System.in);
                char[] inputChars = consoleReader.nextLine().toCharArray();

                int argsIndex=0;
                while (argsIndex<args.length) {
                    for (char c:inputChars
                         ) {
                        if (isDigit(c)) {
                            args[argsIndex] = Character.getNumericValue(c);
                            if (argsIndex % 4 == 0 && argsIndex < 15) {
                                inputstring.append(' ');
                            }
                            inputstring.append(args[argsIndex]);
                            digitsLeft--;
                            argsIndex++;
                        }
                    }
                    if (argsIndex<args.length) {
                        String noDigitsMsg;
                        if (argsIndex == 0) {
                            noDigitsMsg = "Ви не ввели жодної цифри. Введіть 16 цифр номеру карти.";
                        }
                        else {
                            noDigitsMsg = "Ви вели номер: " + inputstring + "\nВведіть ще "+ digitsLeft+ " цифр";
                        }

                        inputChars = consoleReader.nextLine().toCharArray();
                    }
                }

            } catch (ArrayIndexOutOfBoundsException E) {
                System.out.println("\033[31mНомер надто довгий! Оброблятимуться перші 16 цифр.\033[0m");
            }
            finally {
                System.out.println("Введений номер карти:" + inputstring);
                return args;
            }
        }
    }
    private static boolean isDigit(char c){
        return (c >= '0' && c <= '9');
    }

    public static void writeResult(boolean result){
        if (!result) {
            System.out.println("\033[31;1mНомер карти введений з помилкою! Введіть номер ще раз.\033[0m");
        }
        else {
            System.out.println("\033[32;1mНомер карти введений правильно!\033[0m");
        }
    }
}
