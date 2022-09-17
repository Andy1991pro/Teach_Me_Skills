package classwork.fiften;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,9));

        Stream<Integer> intStream = numbers.stream();
        Stream<Integer> myNextStream = Stream.of(1,2,3,4,5); // создать
        Stream<String> linesStream = Files.lines(new File("sample2.txt").toPath()); // читать файл

        Stream<List<Integer>> listStream = Stream.of(numbers, numbers);
        listStream
                .flatMap(Collection::stream); // соединяет в один лист

        Stream<Integer> values = Stream.generate(() -> new Random().nextInt());

        Set<Integer> myResultList = listStream
                .flatMap(Collection::stream) // соединяем
                .collect(Collectors.toSet()); // собирает все, что сюда дошло в новый сет. сохраняет

        intStream
                .sorted() // сортировка
                .sorted((a,b) -> b.compareTo(a)) // сотртировка реверсивно. можно задать свой способ
                .distinct() // убрать повторяющие
                .skip(2) //выкинуть первые 2
                .limit(3) // первые 3
                .map(x -> x*x) // преобразовать
                .filter( x -> x<30) // только то что меньше 30 будет сделано ниже
                // .peek(x ->sout(x) - посмотреть числа
                .forEach(x -> System.out.print(x + " ")); // вывести

        myNextStream
                /*       .mapToDouble(x ->x) //mapTo Integer,Long  переводим в простой тип для доп операций
                            .average()
                            .sum()
                            .max()
                            .min()
                            .summaryStatistics()
                 */
                .filter(x -> x>3) // когда надо все пройти
                //.anyMatch( x -> x>4) // boolean, когда любое
                // .noneMatch x- x>4 // boolen, наоборот
                //.findAny()
                .findFirst();
        //.count сколько элементов осталось

        numbers.forEach(x -> System.out.println(x));
        Map<String, String> myMap = new HashMap<>();
        myMap.forEach((key, value) -> System.out.println(key +" " + value));
    }
}

