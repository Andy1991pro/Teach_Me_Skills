package homework.By.homeworkEleven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestDocument {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("Document.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String document = scanner.nextLine();
                if (document.length()==15){
                if (document.contains("docnum")||document.contains("contract")) {
                    try (FileWriter file1 = new FileWriter("Valid.txt", true)) {
                        file1.write(document+'\n');
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }}
                else {
                    try (FileWriter file2 = new FileWriter("Not Valid.txt", true)){
                        file2.write(document+ " - Wrong start"+'\n');
                    }catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }
                }
                if (document.length()!=15){
                    try (FileWriter file2 = new FileWriter("Not Valid.txt", true)){
                        file2.write(document+ " - Document is too long"+'\n');
                    }catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }

                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
