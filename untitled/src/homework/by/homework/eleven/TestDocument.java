package homework.by.homework.eleven;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestDocument {
    public void creationFile() {
        try (FileWriter file = new FileWriter("Document.txt")) {
            file.write("docnum485739584\n");
            file.write("document7563967\n");
            file.write("docnum48jg84kf9\n");
            file.write("contract48fj39d\n");
            file.write("docnum830584935\n");
            file.write("document830584935\n");
            file.write("contract4857310\n");
            file.write("contract9586749\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void distributionDocument() {
        try (FileReader file = new FileReader("Document.txt");
             FileWriter file1 = new FileWriter("Valid.txt", true);
             FileWriter file2 = new FileWriter("Not Valid.txt", true)) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String document = scanner.nextLine();
                if (document.length() == 15) {
                    if (document.contains("docnum") || document.contains("contract")) {
                        file1.write(document + "\n");
                    } else {
                        file2.write(document + " - Wrong start" + "\n");
                    }
                    if (document.length() != 15) {

                        file2.write(document + " - Document is too long" + '\n');
                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


