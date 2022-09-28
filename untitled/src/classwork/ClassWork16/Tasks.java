package classwork.ClassWork16;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        List<Employee> employees =new ArrayList<>();
        employees.add(new Employee(22,"Worker"));
        employees.add(new Employee(20,"Worker"));
        employees.add(new Employee(24,"Worker"));
        employees.add(new Employee(22,"Worker"));
        employees.add(new Employee(20,"Worker"));
        employees.add(new Employee(27,"Worker"));

        employees.add(new Employee(24,"Manager"));
        employees.add(new Employee(26,"Manager"));
        employees.add(new Employee(28,"Manager"));
        employees.add(new Employee(27,"Manager"));
        employees.add(new Employee(29,"Manager"));
        employees.add(new Employee(24,"Manager"));

        System.out.println(employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble());  // Нашли среднюю ЗП по категориям
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getCategory)));   // разбили по категориям всех сотрудников
        System.out.println(employees.stream().mapToDouble(Employee::getSalary).min());                   // Нашли самого бедного из двух категорий
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getCategory,Collectors.minBy(Comparator.comparing(Employee::getSalary))))); // Разбили по категориям и нашли самого бедного в каждой категории


        List<Product> productList = Arrays.asList(new Product("Milk",11),new Product("Cat",10));
        List<Product> productList2 = Arrays.asList(new Product("Milk",41),new Product("cat1",20));

        List<Order> orders = Arrays.asList(new Order(1,productList),new Order(2,productList2));

        System.out.println("000000"+orders.stream().flatMap(order -> order.getProductList().stream()).distinct().collect(Collectors.toList())); // flatMap Склеили все листы в один, Чтобы сравнивать значения а не листы

        System.out.println(orders.stream().filter(order -> order.getProductList().stream().
                anyMatch(product -> product.getName().equals("Milk"))).
                collect(Collectors.toList()));  // Мы вставили в поток еще один поток (Находим список с продуктами где есть Milk)



    }
}
