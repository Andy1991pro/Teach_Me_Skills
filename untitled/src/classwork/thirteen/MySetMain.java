package classwork.thirteen;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySetMain {
    public static void main(String[] args) {
        // Set лист в котором данные не повторяются
        // HashSet  - хэшкод: Какое-то число соответствующие объекту
        // TreeSet Создает не повторяющиеся по возростанию
        Set<String> mySet = new HashSet<>(); // Если нужно в порядке возрастанию всесто HashSet пишем TreeSet
        System.out.println(mySet.size());
        mySet.add("first");
        mySet.addAll(Arrays.asList("first","second","mine")); // Добавляем значения в лист(Можно добавить сколько хочешь)
        System.out.println(mySet);
        System.out.println(mySet.contains("mine")); // Проверяем есть ли этот элемент
        System.out.println(mySet);
        System.out.println(mySet.isEmpty()); // Проверяем пустой или нет
        System.out.println(mySet.remove("second")); // Удаляем значение
        System.out.println(mySet);


    }
}
