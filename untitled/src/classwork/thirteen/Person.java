package classwork.thirteen;

import java.util.Objects;

public class Person {
    private String password ;
    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {  // Он создает хэшкод вместе с hashCode Если совпадают все параметры он не добавляет нового репрсон в хеш
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(password, person.password) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, firstName, lastName);
    }
}
