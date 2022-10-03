package homework.by.homework17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {


    public FileReader() {
    }
    public static void sortList (String file) {
        Map <String, List<String>> allDate = new HashMap<>();
        List<String> listDocuments = new ArrayList<>();
        List <String> validFiles = new ArrayList<>();
        List <String> numberPhones= new ArrayList<>();
        List <String> emails = new ArrayList<>();
        try {
            File file1 = new File(file);
            java.io.FileReader path = new java.io.FileReader(file1);
            Scanner scanner = new Scanner(path);

            while (scanner.hasNextLine()){
                String document = scanner.nextLine();
                listDocuments.add(document);
            }
            Pattern documentPattern = Pattern.compile("\\d{4}.\\w{3}.\\d{4}.\\w{3}.\\d\\w\\d\\w");
            for (String current :listDocuments){
                Matcher matcher = documentPattern.matcher(current);
                if (matcher.find()){
                    validFiles.add(matcher.group());}
            }
            Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}$");
            for (String current :listDocuments){
                Matcher matcher = phonePattern.matcher(current);
                if (matcher.find()){
                    numberPhones.add(matcher.group());}
            }
            Pattern emailPattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
            for (String current :listDocuments){
                Matcher matcher = emailPattern.matcher(current);
                if (matcher.find()){
                    emails.add(matcher.group());}
            }
            allDate.put("email",emails);
            allDate.put("document",validFiles);
            allDate.put("numberPhone", numberPhones);
            System.out.println(file1.getName()+allDate);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}
