package main.java.goit.group3;

public class Runner {
    public static void main(String[] args) {

        String test = "1234568789545565";
        int [] test2 = {-1,2,3,5,4};
        long test3 = 1234568789545565L;
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
