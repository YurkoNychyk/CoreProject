package main.java.goit.group3;

public class CreditCardValidator implements Validator<CreditCard> {

    @Override
    public boolean validation(CreditCard card) {
        /*
         realization
         */
        return false;
    }

    @Override
    public void printMessage(boolean valid) {
        if (valid){
            System.out.print("Valid!\r");
        }
        else{
            System.out.print("Invalid!");
        }
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
