package classwork.fourteen14;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.Month;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // Выводит сегоднешнюю дату
        LocalDate nexDate = currentDate.plusDays(1); // .plusDays добавили один день к дате
        System.out.println(currentDate.isAfter(nexDate)); // isAfter(nexDate) сравниваем со следующим днем
        System.out.println(currentDate.isBefore(nexDate)); // isBefore(nexDate)  сравниваем сегодня с предыдущим днем
        System.out.println(currentDate.getDayOfWeek()); // getDayOfWeek() спрашиваем сегодняшний день недели
        System.out.println(currentDate.getMonth()); //  getMonth() спрашиваем какой месяц
        System.out.println(currentDate);
        if (Month.SEPTEMBER.equals(currentDate.getMonth())){ // Проверели месяц
            System.out.println("Today is september");
        }
        if (DayOfWeek.MONDAY.equals(currentDate.getDayOfWeek())){ //Проверили день
            System.out.println("Today is september");
        }
        System.out.println(currentDate.getDayOfMonth()); // Спросили какой деньмесяца
        System.out.println(currentDate.getDayOfYear()); // Спросили какой день года
        LocalDateTime currentTime =  LocalDateTime.now(); // Выводит настоящее время
        System.out.println(currentTime);
        LocalTime localTime = LocalTime.now(); // Выводит время без даты
        System.out.println(localTime);
        ZonedDateTime zoneTime = ZonedDateTime.now(); // Выводит часовой пояс
        System.out.println(zoneTime);

        Date currentDate1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // dd День, MM Месяц, yyyy Год
        System.out.println(format.format(currentDate1)); // format.format(currentDate1) Нужно ввести в скобки иначе не будет работать
    }
}
