package classwork.classwork.twelve;

import java.io.Serializable;

public class Person implements Serializable { //implements Serializable {Вызываем интерфейс(вшит в java)}
    private static final long serialVersionUID = 42L; // Помогает понять кто сохранил файл
    // где 42L Это пароль. Для записи нужен класс с таким же классом.
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
