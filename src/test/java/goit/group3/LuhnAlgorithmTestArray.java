package test.java.goit.group3;


import main.java.goit.group3.LuhnAlgorithm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class LuhnAlgorithmTestArray {

    private int[] ints;
    private boolean expectedCheck;

    public LuhnAlgorithmTestArray(int[] ints, boolean expectedCheck) {
        this.ints = ints;
        this.expectedCheck = expectedCheck;
    }

    @Parameterized.Parameters(name = "{index}:  (Card {index} is {1}") // тестовое сообщение
    public static Collection<Object[]> data() {
        int[] ints1 = {4, 4, 1, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 3};
        int[] ints2 = {4, 4, 1, 3, 1, 3, 0, 8, 5, 6, 8, 5, 8, 5, 9, 0};
        int[] ints3 = {6, 7, 6, 2, 8, 0, 3, 8, 8, 8, 8, 5, 5, 0, 3, 2, 6, -9,};
        int[] ints4 = {4, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int[] ints5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 2, 1, 3, 2};

        return Arrays.asList(new Object[][]{
                {ints1, false},
                {ints2, true},
                {ints3, false},
                {ints4, false},
                {ints5, false},
            }
        );
    }

    @Test
    public void testValidateNumber() throws Exception {
        boolean result = LuhnAlgorithm.cardNumberIsValid(ints);
        Assert.assertEquals(expectedCheck, result);
    }
}