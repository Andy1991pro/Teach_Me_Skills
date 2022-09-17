package classwork.fourteen14;

public enum Month {
    // enum создается как обычный класс, используется для хранения постоянных данных//
    JANUARY(1), FEBRUARY(2), MARCH(3);
    private final int number; //Задаем номер
     Month (int number){      // Создали метод
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
