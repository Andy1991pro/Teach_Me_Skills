package ClassWork.Eleven;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner s = new Scanner(System.in);
        String str = "123";
        int value =0;
        try {
            value = getIntFromString(str);
            if (value>1000){
                throw new TooBigNumberException(value);
            }
        } catch (NumberNotFoundException e) {
            value++;
            e.printStackTrace();
        } catch (TooBigNumberException e){
            value = 1000;
            System.out.println("oops, too big");
            e.printStackTrace();
        }

          }
    private static int getIntFromString(String string) throws NumberNotFoundException {
        try {
            return Integer.parseInt(string);   //Позваляет вывести число из строчки
        } catch (NumberFormatException e) {
            throw new NumberNotFoundException(string);
        }

    }
}

// Домашня работа - Связана с ошибками. Сделать если не верное значение пусть ловит ошибку.
