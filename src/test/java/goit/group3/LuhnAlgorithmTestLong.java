//package test.java.goit.group3;
//
//
//import main.java.goit.group3.LuhnAlgorithm;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@RunWith(value = Parameterized.class)
//
//public class LuhnAlgorithmTestLong {
//
//    private Long ints;
//    private boolean expectedCheck;
//
//    public LuhnAlgorithmTestLong(Long ints, boolean expectedCheck) {
//        this.ints = ints;
//        this.expectedCheck = expectedCheck;
//    }
//
//    @Parameterized.Parameters(name = "{index}:  (Card {index} is {1}") // тестовое сообщение
//    public static Collection<Object[]> data() {
//        Long ints1 = 4413130856858590L;
//        Long ints2 = 400000015612L;
//        Long ints3 = 6762803888855032L;
//        Long ints4 = 4417123456789113L;
//        Long ints5 = 400000015612L;
//
//        return Arrays.asList(new Object[][]{
//                        {ints1, true},
//                        {ints2, false},
//                        {ints3, false},
//                        {ints4, false},
//                        {ints5, false},
//                }
//        );
//    }
//
//    @Test
//    public void testValidateNumber() throws Exception {
//        boolean result = LuhnAlgorithm.cardNumberIsValid(ints);
//        Assert.assertEquals(expectedCheck, result);
//    }
//}