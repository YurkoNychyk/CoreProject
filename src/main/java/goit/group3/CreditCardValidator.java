package main.java.goit.group3;

public class CreditCardValidator implements Validator<CreditCard> {

    @Override
    public boolean validation(CreditCard card) throws WrongNumberException {
        String cardNumber = card.getNumber().replaceAll("\\s", "");
        card.setNumber(cardNumber);

        if (!isOnlyNumeric(cardNumber))
           throw new WrongNumberException("Only numeric symbols should be here.");
        if (cardNumber.length() <16)
            throw new WrongNumberException("Number should be 16 digits");

        return LuhnAlgorithm.luhnAlgorithm(card.getNumber());
    }

    private boolean isOnlyNumeric(String str) {
        if (str == null)
            return false;
        for (char c : str.toCharArray())
            if (c < '0' || c > '9')
                return false;
        return true;
    }
}
