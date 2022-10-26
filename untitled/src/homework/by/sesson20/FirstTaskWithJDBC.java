package homework.by.sesson20;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTaskWithJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "Bizzic7567");
            Statement statement = connection.createStatement();
//            initDB(statement);
//            createNewTable(statement);
            setStudents(statement);
            setStudentsAndCountries(statement);
            setJoinTables(statement);
            forTables(statement);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception");
        }
    }

    private static void forTables(Statement statement) {
        for (int i =0;i<=10;i++) {
            System.out.println("Для удаления студента нажмите 1" + "\n" + "Для добавления студета нажмите 2"+"\n"+"Для выхода нажмите 3");
            int scanner = new Scanner(System.in).nextInt();
            if (scanner == 1) {
                deleteStudent(statement);
            }
            if (scanner == 2) {
                addStudent(statement);
            }
            if (scanner==3){
                break;
            }
        }
    }

    private static void setJoinTables(Statement statement) throws SQLException {
        ResultSet setJoinTables = statement.executeQuery("select * from students left join students_and_countries uc on students.id = uc.id");
        while (setJoinTables.next()){
            System.out.println(setJoinTables.getInt("id") + " \t " + setJoinTables.getString("student_name") + " \t " + setJoinTables.getDouble("average_marks" ) +  " \t "  + setJoinTables.getString("city"));

        }
        System.out.println("----------------");
    }

    private static void setStudentsAndCountries(Statement statement) throws SQLException {
        ResultSet setStudentsAndCountries = statement.executeQuery("select * from students_and_countries");
        while (setStudentsAndCountries.next()) {
            System.out.println(setStudentsAndCountries.getInt("id") + " \t " +setStudentsAndCountries.getString("student_name") + " \t " + setStudentsAndCountries.getString("city"));

        }
        System.out.println("---------------");
    }

    private static void setStudents(Statement statement) throws SQLException {
        ResultSet setStudents = statement.executeQuery("select * from students");
        while (setStudents.next()) {
            System.out.println(setStudents.getInt("id") + " \t " + setStudents.getString("student_name") + " \t " + setStudents.getDouble("average_marks"));
            }
        System.out.println("----------------");
    }

    private static void initDB(Statement statement) throws SQLException {
        statement.executeUpdate("create table if not exists students(id integer  primary key auto_increment,student_name varchar(30)  not null , average_marks double not null )");
        statement.executeUpdate("create table if not exists students_and_countries(id integer  primary key auto_increment,student_name varchar(30) not null , city  varchar(30)not null )");
        statement.executeUpdate("insert into students (student_name, average_marks) values ('Andy',10.0),('Maryna', 5.3),('Svetlana',6.0),('Katya',3.1)");

    }
    private static void createNewTable(Statement statement) throws SQLException {
        statement.executeUpdate("insert into students_and_countries (student_name, city) values ('Andy','Minsk'),('Maryna', 'Brest'),('Svetlana','Grodno'),('Katya','Minsk')");
    }
    private static void addStudents (Statement statement){

    }
    private  static void deleteStudent (Statement statement){
        String studentName=null;
        System.out.println("Введите имя студента: ");
        for(int i=0;i<10;i++) {
            String scanner = new Scanner(System.in).nextLine();
            Pattern studentNamePattern = Pattern.compile("^[a-zA-Z]*$");
            Matcher studentNameMatcher = studentNamePattern.matcher(scanner);
            if(studentNameMatcher.matches()){
                studentName=studentNameMatcher.group();
                break;
            }
            else {
                System.out.println("Имя студента не может содержать число или спецсимволы");
            }
        }
        try {
            statement.executeUpdate("delete from students where student_name = '"+studentName+"'");
            statement.executeUpdate("delete from students_and_countries where student_name = '"+studentName+"'");
            System.out.println("Студент удален");
        } catch (SQLException e) {
            System.out.println("Студент на найден");
        }
    }
    private static void addStudent (Statement statement){
        String studentName = null;
        try {
            for (int i=0;i<10;i++) {
                System.out.println("Введите имя студента");
                String nameStudent = new Scanner(System.in).nextLine();
                Pattern namePattern = Pattern.compile("^[a-zA-Z]*$");
                Matcher matcherStudent = namePattern.matcher(nameStudent);
                if (matcherStudent.matches()) {
                    studentName = matcherStudent.group();
                    break;
                } else {
                    System.out.println("Имя не верного формата. Имя не может содержать спецсимволы и числа");
                }
            }
            System.out.println("Введите средний бал");
            double averageMarks=0;
            while (true) {
                try {
                double averageMarksScanner = new Scanner(System.in).nextDouble();

                if (averageMarksScanner < 10 && averageMarksScanner > 0) {
                    averageMarks = averageMarksScanner;
                    break;
                } else {
                    System.out.println("Средний бал должен быть больше 0 и меньше 10.0" + "\n" + "Повторите попытку");
                }
                break;
                }
                catch (InputMismatchException e){
                    System.out.println("Введите число");
                }

            }
            String city=null;
            for (int i=0;i<10;i++) {
                System.out.println("Введите город");
                String cityScanner = new Scanner(System.in).nextLine();
                Pattern cityPattern = Pattern.compile("^[a-zA-Z]*$");
                Matcher matcherCity = cityPattern.matcher(cityScanner);
                if (matcherCity.matches()) {
                    city = matcherCity.group();
                    break;
                } else {
                    System.out.println("Город не верного формата. город не может содержать спецсимволы и числа");
                }
            }
            statement.executeUpdate("insert into students_and_countries (student_name, city) values ('" +studentName + "',"+"'"+city+"')");
            statement.executeUpdate("insert into students (student_name, average_marks) values ('"+studentName+"',"+averageMarks+")");
            System.out.println("Студент добавлен");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Данные введены не верно");
        }
    }

}