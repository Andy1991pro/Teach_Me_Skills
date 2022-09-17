package homework.by.twelve;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import static java.nio.file.Files.*;


public class FileMethod {
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
    public  void sortText (String file){
        try {
            ArrayList<String> text = new ArrayList<>(readAllLines(Paths.get(file)));
            Collections.sort(text);
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void noDuplicates (String file){
        try {
            HashSet <String> number = new HashSet<>(readAllLines(Paths.get(file)));
            System.out.println(number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
