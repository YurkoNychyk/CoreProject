package test.java.goit.group3;

import main.java.goit.group3.LuhnAlgorithm;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//
//@RunWith(value = Parameterized.class)
//
//public class LuhnAlgorithmTestString {
//
//    private String number;
//    private boolean expectedCheck;
//
//    public LuhnAlgorithmTestString(String number, boolean expectedCheck) {
//        this.number = number;
//        this.expectedCheck = expectedCheck;
//    }
//
//    @Parameterized.Parameters(name = "{index}:  (validation for {0} is {1}") // тестовое сообщение
//    public static Iterable<Object[]> data(){
//        return Arrays.asList(new Object[][]{
//                {"1234567891012132", false},
//                {"6762803888855032", false},
//                {"4417123456789113", false},
//                {"400000015612", false},
//                {"4413130856858590", true}
//            }
//        );
//    }
//    @Test
//    public void testValidateNumber() throws Exception {
//        System.out.println(number);
//        boolean result =LuhnAlgorithm.cardNumberIsValid(number);
//        Assert.assertEquals(expectedCheck, result);
//    }
//}