package homework.by.lesson18;

import java.util.Scanner;
// D:\data\data.xml Путь для быстрой проверки //
public class ParsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        MethodPars.builder(path);


    }
}
