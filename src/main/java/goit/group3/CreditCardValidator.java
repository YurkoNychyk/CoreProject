package main.java.goit.group3;

public class CreditCardValidator implements Validator<CreditCard> {

    @Override
    public boolean validation(CreditCard card) {
//        cardNumber = card.getCardNumber().replaceAll("\\s","");
//        card.setCardNumber(cardNumber);
//

//        if (!isOnlyNumeric(cardNumber))
//            throw new WrongNumberException(cardNumber);
//
//        return LuhnAlgorithm.checkNumber(card.getCardNumber());
        return false;
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
