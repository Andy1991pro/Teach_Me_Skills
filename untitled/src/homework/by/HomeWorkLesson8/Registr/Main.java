package homework.by.HomeWorkLesson8.Registr;


public class Main {
    public static void main(String[] args) {
        Register register =new Register(10);
        register.addDocument(new FinanceDocuments());
        register.printDocument();
        register.addDocument(new Contract());
        register.printDocument();


    }
}
