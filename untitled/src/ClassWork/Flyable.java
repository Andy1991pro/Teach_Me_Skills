package ClassWork;

public interface Flyable {
    default void fly(){
        System.out.println(getString()+", Ican fly");
    }
private String getString(){
        return "Ooh";
}
}
