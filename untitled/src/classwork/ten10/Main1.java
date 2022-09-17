package classwork.ten10;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String testString = "This is our big String";
        System.out.println(testString.charAt(3)); //Возвращает значение находящиеся на заданном в нем месте

       char[] myChar = new char[3];
       testString.getChars(6,9,myChar,0); // Выводим несколько сиволов подряд
        System.out.println(Arrays.toString(myChar));

        char needed ='i';
        int count =0;
        for (char element :testString.toCharArray()){ //Ищим колличество i в строке
            if (element == needed){
            count++;}
        }
        System.out.println(count);
        String intToStr = String.valueOf(5); // Переводит число в строчку

        int index = testString.indexOf(" is"); // Находит символы в строчке (перое место)
        System.out.println(index);
        int lastIndex = testString.lastIndexOf("is"); //Находит последнее место (значения)
        System.out.println(testString.startsWith("This"));
        System.out.println(testString.endsWith("String"));

        testString.replace('i','a'); // Меняет один символ на другой
        testString = testString.replace('i','a').replace('T','O'); // Перезаписывает значение
        System.out.println(testString);

        System.out.println("s  s ss".trim());// Обрезает пробелы в начале и в конце

        System.out.println("IOoppJ".toLowerCase());// Делает все симвалы маленькими
        System.out.println("fJfKKmmdS".toUpperCase());// Делает все символы большими

        String massegaString = "this is my house";
        String [] massegaArray = massegaString.split(" "); //Заполняет все слова в массив
        System.out.println(Arrays.toString(massegaArray));

        System.out.println(massegaArray[0].isEmpty()); //Проверяет начало строчки на пустоту
        String is  = "     ";
        System.out.println(is.isEmpty()); //Показывает что строчка не пустая по тому, сто там есть пробелы
        System.out.println(is.isBlank());//Показывает состоит ли строчка из одних пробелов

        // System.out.println(is == null || is.isEmpty()); //Проверяет на ноль
      // System.out.println(is == null || is.isBlank()); // Показывает есть ли там пробел если там нет ноля

        index = massegaString.indexOf("is");
        System.out.println(massegaString.substring(index + 2));// Помогает найти все одинаковые последовательности
        // Сдвиг нужен для выреза последовательности


        String testString2 = "this is my is example";  //Находит количество совпадений (для переменной длины)
        String match = "is";
        int count2 =0;
        int index2 =testString2.indexOf(match);
        while (index2!= -1){
            count2++;
            testString2 = testString2.substring(index + match.length()); //substring Берет строку из подстроки
            index2 =testString2.indexOf(match);
        }
        System.out.println(count2);

        // Сравниваем строчки
        System.out.println("TEST".equals("test")); //Сравнивает с учетом размера символа
        System.out.println("TEST".equalsIgnoreCase("test"));// Игнорирует размер букв при сравнении


// Сортируем строчки (Способ сортировки слов)
        System.out.println("test".compareTo("aest")); // Правая строчка меньше (по алфавиту)
        System.out.println("test".compareTo("test")); // 0 нет откланений
        System.out.println("test".compareTo("zest")); // -1 (стаят правильно но значения разные)
        System.out.println("test".compareTo("test1")); // -6 (стоят правильно но правая длинее)


//  Ищим совпадения, два метода
        String str5 = "This is our string";
        System.out.println(str5.contains("our"));//Ищим совпадение с учетом заглавных
        System.out.println(str5.toLowerCase().contains("our".toLowerCase()));// ищим совпадения без учета заглавных

//

        }

}
