package main.java.goit.group3;

public class Runner {
    public static void main(String[] args) {

        String test = "1234567891012132";
        int [] test2 = {-1,2,3,5,4};
        //int test3 = 1234567891012132;
        boolean check;
        try {
            check = LuhnAlgorithm.validateNumber(test);
            if (check) {
                System.out.println("true");
            } else System.out.println("false");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
