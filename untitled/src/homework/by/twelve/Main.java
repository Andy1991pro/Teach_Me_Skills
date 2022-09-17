package homework.by.twelve;

public class Main {
    public static void main(String[] args) {
        FileMethod file = new FileMethod();
        file.enterFile();
        file.enterNumber();
        file.sortText("Word.txt");
        file.noDuplicates("Number.txt");
    }
}
