package classwork.classwork.twelve;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter { // implements FileFilter Это интерфейс который мы добавляем

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".txt"); //  endsWith(".txt") Ищет файлы которые заканчиваются на .txt
    }
}
