package homework.by.homework17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumber {

    public static void sortList(String path) {
        Document document = new Document();
        try {

            List<String> list=new ArrayList<>();
            File file=new File(path);
            FileReader fileReader=new FileReader(file);
            Scanner scanner=new Scanner(fileReader);
            Pattern patternDocument = Pattern.compile("\\d{4}\\-\\w{3}\\-\\d{4}\\-\\w{3}\\-\\d\\w\\d\\w");
            Pattern patternEmail = Pattern.compile("^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
            Pattern patternTelephone = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
            while(scanner.hasNextLine()){
                String string=scanner.nextLine();
                Matcher matcher=patternDocument.matcher(string);
                Matcher matcher1=patternEmail.matcher(string);
                Matcher matcher2=patternTelephone.matcher(string);
                if(matcher.find()){
                    list.add(string);
                    document.setDocuments(list);
                }
                if(matcher1.find()){
                    document.setPhone(string);
                }
                if(matcher2.find()){
                    document.setEmail(string);
                }

            }
            Map <String,Document> myMap = new HashMap<>();
            myMap.put(file.getName(),document);
            System.out.println(myMap);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
