package main.java.goit.group3;

public interface Validator<T> {
    boolean validation(T obj);


    public void printMessage(boolean valid);

}
