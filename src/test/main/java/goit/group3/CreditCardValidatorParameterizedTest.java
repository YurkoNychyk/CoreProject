package main.java.goit.group3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)

public class CreditCardValidatorParameterizedTest {
    private static final CreditCardValidator creditCardValidator = new CreditCardValidator();
    private boolean expected;
    private String cardNumber;

    public CreditCardValidatorParameterizedTest(String cardNumber, boolean expected) {
        this.cardNumber = cardNumber;
        this.expected = expected;

    }

@Parameterized.Parameters(name = "{index}:  (validation for {0} is {1}")

public static Iterable<Object[]> data(){
    return Arrays.asList(new Object[][]{
                    {"1234567891012132", false},
                    {"676280388885503265", true},
                    {"4417123456789113", true},
                    {"40000001234567899", false},
                    {"4413130856858590", true}

            }
    );
}

    @Test
    public void testValidation() throws WrongNumberException {

            CreditCard card = new CreditCard(cardNumber);
            boolean result = creditCardValidator.validation(card);

            Assert.assertEquals(expected, result);
    }



}
