package classwork.classwork.twelve;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

                      // Читали строчки из файла который создали ранее //

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("sample.txt"); // FileReader {Метод позваляет читать файл}
            Scanner scanner = new Scanner(file);                     // Scanner {Позваляет читать файл}
            while (scanner.hasNextLine()) {                           // scanner.hasNextLine() {Читает все строчки в файле(через While)}
                System.out.println(scanner.nextLine());
            }
         // while (scanner.hasNext()) {                // scanner.hasNext() {Читает все строчки пословно (через While)}
         //    System.out.println(scanner.next());    // scanner.next() {Выводит каждое слово на новой строчке}
         //  }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
