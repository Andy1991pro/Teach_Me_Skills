package classwork.thirteen;
//  //
public class KeyHolder <T> {  // <T> Позволяет задать неопределенный тип значения String/int
    private  T value;   // T нужно добавлять в месте где нужен стринг или инт
    public KeyHolder(T value){
        this.value=value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
