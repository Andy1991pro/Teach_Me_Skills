package homework.by.homewor.twen;


import java.util.Scanner;
import static homework.by.homewor.twen.DocumentMethod.*;

// 5554-rft-4839-AbC-4t2v Пример документа для быстрой проверки
public class MainDocument {
    public static void main(String[] args) {
        System.out.println("Enter number document format: xxxx-yyy-xxxx-yyy-xyxy");
        Scanner scanner = new Scanner(System.in);
        String document = scanner.nextLine();
       pattern(document);
    }
    }

