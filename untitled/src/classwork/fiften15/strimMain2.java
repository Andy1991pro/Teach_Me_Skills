package classwork.fiften15;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class strimMain2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,9));
        numbers.stream().mapToDouble(x -> x).average().orElse(0); // DoubleStream , IntStream, LongStream Это определенные стримы со своими особенными методами
        DoubleSummaryStatistics statistics = numbers.stream().mapToDouble(x->x).summaryStatistics();
        IntSummaryStatistics statistics1 = numbers.stream().mapToInt(x->x).summaryStatistics(); // IntSummaryStatistics Дает всю статистику но в целых
        System.out.println(statistics.getMax()+" "+statistics.getAverage()+" "+statistics.getSum()); // DoubleSummaryStatistics Позволяет собрать всю статистику зв один раз (Сумму, среднее и все такое)
        // orElse Вернет 0 если нет чисел!!! Для того чтоб небыло ошибки

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,1,2,2,7,3,4,5,6,7,9));
        Map<Integer,Long> result = numbers1.stream().
                collect(Collectors.groupingBy(Function.identity(), // groupingBy Групируем по какому-то признаку  Function.identity() Значения которые есть в листе по очереди
                        Collectors.counting())); // Collectors.counting()  Это количество которое встречается значение
        System.out.println(result);


        List<Persons.Person> people = new ArrayList<>();
        people.add(new Persons.Person(20, "andy"));
        people.add(new Persons.Person(21, "andy1"));
        people.add(new Persons.Person(22, "andy2"));
        people.add(new Persons.Person(22, "andy3"));
        Map<Integer,List<Persons.Person>> listMap = people.stream().collect(Collectors.groupingBy(Persons.Person::getAge)); // Persons.Person::getAge :: Это значит из метода сравнить по возросту (Age)
        System.out.println(listMap);
    }

}
