package ClassWork.Eleven;

public class TooBigNumberException extends Exception {
    public TooBigNumberException(int number) {
        super("Number " + number + "is higher than 1000");
    }
}
