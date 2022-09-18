package homework.by.twelve;

public class Main {
    public static void main(String[] args) {
        FileMethod file = new FileMethod();
        FileMethod.enterFile();
        FileMethod.enterNumber();
        file.printSortedText("Word.txt");
        file.printWithoutDuplicates ("Number.txt");
    }
}
