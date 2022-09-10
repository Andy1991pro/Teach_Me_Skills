package homework.By.homeworkEleven;

import java.io.FileWriter;
import java.io.IOException;

public class EnterDocument {
    public void creationFile () {
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
}
