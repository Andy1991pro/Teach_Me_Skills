package homework.By.HomeWorkTen;

import java.util.Scanner;
// 5554-rft-4839-AbC-4t2v Пример документа для быстрой проверки
public class MainDocument extends DocumentMethod {
    public static void main(String[] args) {
        DocumentMethod str = new MainDocument();
        System.out.println("Enter number document format: xxxx-yyy-xxxx-yyy-xyxy");
        Scanner document1 = new Scanner(System.in);
        String document = document1.nextLine();
        str.OutNumber(document);
        str.OutLetters(document);
        str.OutAllLiters(document);
        str.CommitMyDocument(document);
        str.TestStart555(document);
        str.MatchTestABC(document);
        str.MatchTestEnd(document);
    }
    }

