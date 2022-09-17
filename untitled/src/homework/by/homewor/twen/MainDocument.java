package homework.by.homewor.twen;

import java.util.Scanner;
// 5554-rft-4839-AbC-4t2v Пример документа для быстрой проверки
public class MainDocument extends DocumentMethod {
    public static void main(String[] args) {
        System.out.println("Enter number document format: xxxx-yyy-xxxx-yyy-xyxy");
        Scanner document1 = new Scanner(System.in);
        String document = document1.nextLine();
        outNumber(document);
        outLetters(document);
        outAllLiters(document);
        commitMyDocument(document);
        testStart555(document);
        matchTestABC(document);
        matchTestEnd(document);
    }
    }

