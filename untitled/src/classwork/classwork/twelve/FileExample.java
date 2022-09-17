package classwork.classwork.twelve;

import java.io.File;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("rsc");
        // В методе File Лежат все методы для файла (Относительныйй метод задачи пути) файл должен лежать в корне проекта

        // команды с флешем \n - перенос на новую строчку,  \t вставляет TAB в сирочке. Ставится в месте где нужно.

        System.out.println(file.isDirectory());        // isDirectory isDirectory Проверяет папка это или нет возвращает булевое значение
        System.out.println(file.isFile());             // isFile Проверяет файл это или нет возвращвет болевое
        System.out.println(file.isHidden());           // isHidden Проверяет является ли файл скрытым
        System.out.println(file.getAbsoluteFile());    // getAbsoluteFile Показывает обсалютный путь к файлу
        System.out.println(file.getParent());          // getParent Показывает родительскую папку файла (Папку выше по дереву)
        //file.delete();         Удаляет выбранный файл
        //file.mkdir();          Создает новую папку
        //file.createNewFile();  Создает файл
        System.out.println(Arrays.toString(file.list())); //  Arrays.toString(file.list()) указывает все файлы которые лежать в папке

        //for (File currentFile: file.listFiles()) {        // .listFiles() Возвращает лист файлов лежащих в папке
         //   System.out.println(currentFile.getName());    // .getName() Выводит имена всех файлов в папке

            for (File currentFile1: file.listFiles(new MyFileFilter())) { //вызываем наш медот new MyFileFilter()
                System.out.println(currentFile1.getName());               // Выводим на печать все файлы с расширением которые мы попросили

            }
        }
        }


