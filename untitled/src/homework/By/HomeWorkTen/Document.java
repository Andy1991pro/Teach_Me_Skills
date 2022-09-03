package homework.By.HomeWorkTen;


import java.util.Scanner;

public class Document {
    public static void main (String[] args) {
        System.out.println("Enter number document format: xxxx-yyy-xxxx-yyy-xyxy");
        Scanner document1 = new Scanner(System.in);
        String document = document1.nextLine();
        char[] myDocument = new char[9];
        document.getChars(0,4,myDocument,0);
        document.getChars(9,13,myDocument,5);
        myDocument[4] = ' ';
        System.out.println(myDocument);


    }
}