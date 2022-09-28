package homework.by.thirteen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter date, format: dd-MM-yyyy ");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(date1.getDayOfWeek());
    }
}
