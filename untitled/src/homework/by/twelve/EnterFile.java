package homework.by.twelve;

import java.io.FileWriter;
import java.io.IOException;


public class EnterFile {
    public void enterFile() {

        try (FileWriter word = new FileWriter("Word.txt", true)){
            word.write("car\n");
            word.write("table\n");
            word.write("pencil\n");
            word.write("plum\n");
            word.write("horse\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void enterNumber (){
        try (FileWriter number = new FileWriter("Number.txt", true)){
            number.write("1\n");
            number.write("6\n");
            number.write("3\n");
            number.write("8\n");
            number.write("0\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  void scanText (String document){

    }
}
