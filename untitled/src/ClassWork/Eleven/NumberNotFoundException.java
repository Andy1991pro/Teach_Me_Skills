package ClassWork.Eleven;

public class NumberNotFoundException extends Exception {

    public NumberNotFoundException(String value){
        super("Value "+ value+"can't be converted to integer");
    }
    public NumberNotFoundException(String value, Throwable exception){
        super("Value "+ value+"can't be converted to integer", exception); // Сложный конструктор позволяет записать через запятую (причину)

}}
