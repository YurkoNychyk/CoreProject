package goit.group3;

public class CreditCardValidator implements Validator {
    @Override
    public boolean validation(Object obj) {

        /*
         realization
         */
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
