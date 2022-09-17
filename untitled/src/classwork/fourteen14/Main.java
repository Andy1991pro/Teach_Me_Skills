package classwork.fourteen14;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.JANUARY.ordinal()); // ordinal() Показывает номер позиции как в массиве

        for (Month month: Month.values()){ // Month.values() Выводим все енамы (Постоянные переменные)
        System.out.println(month);}

        Month month = Month.JANUARY; // Можно вызвать месяц и запихнуть его в case
        switch (month){
            case JANUARY:
                System.out.println("it is "+Month.JANUARY.getNumber()+" month"); break; // Month.JANUARY.getNumber() Вернет на печать номер присвоеный в Month
            case FEBRUARY:
                System.out.println("it is  month");break; //Выносить в отдельный метод Ctr+Alt+M
        }

    }
}
