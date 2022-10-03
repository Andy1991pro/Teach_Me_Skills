package homework.by.homework17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FailReader {


    public FailReader() {
    }
    public static void SortList (String file) {
        Map <String, List<String>> allList = new HashMap<>();
        List<String> listDocuments = new ArrayList<>();
        List <String> validFiles = new ArrayList<>();
        List <String> numberPhones= new ArrayList<>();
        List <String> emails = new ArrayList<>();
        try {
            File file1 = new File(file);
            FileReader path = new FileReader(file1);
            Scanner scanner = new Scanner(path);

            while (scanner.hasNextLine()){
                String document = scanner.nextLine();
                listDocuments.add(document);
            }
            Pattern pattern = Pattern.compile("\\d{4}.\\w{3}.\\d{4}.\\w{3}.\\d\\w\\d\\w");
            for (String current :listDocuments){
                Matcher matcher = pattern.matcher(current);
                if (matcher.find()){
                    validFiles.add(matcher.group());}
            }
            Pattern pattern1 = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}$");
            for (String current :listDocuments){
                Matcher matcher = pattern1.matcher(current);
                if (matcher.find()){
                    numberPhones.add(matcher.group());}
            }
            Pattern pattern2 = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
            for (String current :listDocuments){
                Matcher matcher = pattern2.matcher(current);
                if (matcher.find()){
                    emails.add(matcher.group());}
            }
            allList.put("email",emails);
            allList.put("document",validFiles);
            allList.put("numberPhone", numberPhones);
            System.out.println(file1.getName()+allList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}
