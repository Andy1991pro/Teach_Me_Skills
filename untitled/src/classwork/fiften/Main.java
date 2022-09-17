package classwork.fiften;

public class Main extends Persons {
    public static void main(String[] args) {
        Person firstPerson = new Person(20,"Vika");
        Person secondPerson = new Person(25, "Nikita");
        secondPerson.setNickname("Nick"); // 4 символа

        secondPerson.getOptionalNickname()
                .map(nick -> nick.length() + 3) // превращаем nick в  int 7
                .filter(value -> value > 7)// если > 7, оставляй. если меньше, выкидывай
                .ifPresentOrElse(nick -> System.out.println(nick), () -> System.out.println(0)); // условие

        //  String nickName = firstPerson.getOptionalNickname().orElseThrow(); // если есть ник то сделаем переменную, если нет, то ошибка

        firstPerson.getOptionalNickname().ifPresent(nick -> System.out.println()); // по факту выводится переменная nickname но ее назвали nick
        System.out.println(firstPerson.getOptionalNickname().orElse("").length()); // вместо долгого if else
        System.out.println(secondPerson.getOptionalNickname().orElse(getTestString()).length()); // выполняется условие для Nick
        // но getTestString все равно выполняется

        System.out.println(secondPerson.getOptionalNickname().orElseGet(() -> getTestString()).length()); // supplier,ничего не принимает. т.к.
        // нужно будет вызвать метод если...
    }
    private static String getTestString(){
        System.out.println("this is my test string");
        return ""; // метод имеет в итоге пустую строку
    }
}

