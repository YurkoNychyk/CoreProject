package main.java.goit.group3;

import java.util.Scanner;

public class Console {
    private static Scanner consoleReader;
    public static int[] readData(String welcomeString,int argsNumber) {
        int digitsLeft=16;
        while (true) {
            try {
                consoleReader = new Scanner(System.in);
                int[] args = new int[argsNumber];
                System.out.println(welcomeString );
                char[] inputChars = consoleReader.nextLine().toCharArray();
                StringBuffer inputstring= new StringBuffer("");

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
                        System.out.println("Ви вели номер: "+ inputstring+"\nВведіть ще "+ digitsLeft+ " цифр");
                        inputChars = consoleReader.nextLine().toCharArray();
                    }
                }
                System.out.println("Введений номер карти:" + inputstring);


                return args;
            } catch (Exception E) {
                System.out.println("Помилка вводу!" + E.getMessage());
            }
        }
    }
    private static boolean isDigit(char c){
        return (c >= '0' && c <= '9');
    }

    public static String readStringData(String welcomeMessage) {
        System.out.println(welcomeMessage);
        return consoleReader.nextLine();
    }
}
