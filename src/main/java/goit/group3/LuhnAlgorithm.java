package main.java.goit.group3;

public class LuhnAlgorithm {

    public static boolean luhnAlgorithm(String number){
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            char tmp = number.charAt(i);
            int num = tmp - '0';
            int product;
            if (i % 2 != 0){
                product = num * 1;
            }
            else{
                product = num * 2;
            }
            if (product > 9)
                product -= 9;
            sum+= product;
        }
        return (sum % 10 == 0);
    }
}
