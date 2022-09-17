package classwork.thirteen13;

import java.util.*;

public class MyMapMain {
    // Map key, value -  ключ и значение
    // HashMap Сортирует в случайном порядке
    // TreeMap Сортирует по порядку (по алфавиту)
    // 1- Терапевт , 2 - Хирург, 3 - Дантист; 1,2,3 Это ключ а Дантист - Это значение.
    // Ключ - котегория, значение - List<Product>
    public static void main(String[] args) {
        Map<Integer, String> doctorMap = new HashMap<>(); //Создает Map
        doctorMap.put(1,"Terapevt");
        doctorMap.put(2,"Surgeon");
        doctorMap.put(3,"Dentist"); // Заполняем значения
        System.out.println(doctorMap);

        Map<String, List<String>> product = new HashMap<>();
        product.put("first", Arrays.asList("first prod","second prod")); // Создали мап с продуктоми
        product.put("second prod",new ArrayList<>()); //Создали пустой лист в мап (Выведет не в том порядке, он сортирует сам)
        System.out.println(product);
        System.out.println(product.get("first")); // Вывели два значения по одному ключу
        System.out.println(product.get("first").get(0)); // Выводим определенный элемент листа
        System.out.println(product.get("second prod").add("Product 1")); // Добавляем элемент в пустой ключ
        // Arrays.asList в этот лист добавить ничего нельзя а в  ArrayList можно
        product.put("third",product.get("second prod")); // Привязали к одному ключу два значения
        product.put("second prod", new ArrayList<>()); // Перезаписываем ключ на новое значение
        System.out.println(product);
        // Нельзя менять значение класса !!!

        System.out.println(product.keySet()); // Показывает все ключи в мэп
        System.out.println(product.values()); //Показывает все значения
        System.out.println(product.containsKey("dhhf")); //Проверяем есть ли такой ключ (Возвращает булевое значение)
        System.out.println(product.containsValue("Product 1")); // Проверяем ести ли такое значение но всего листа (Возвращает булевое значение)
        System.out.println(product.entrySet()); // Выводит все значения ключа и значения в одну строку Через ! for !
        }
        
    }


