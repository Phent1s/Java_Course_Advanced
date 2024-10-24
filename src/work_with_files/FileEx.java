package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\aboba\\file");
        File folder2 = new File("C:\\aboba\\file12");
        File file2 = new File("test10.txt");
        System.out.println("get absolute path: " +file.getAbsolutePath());
        System.out.println("get absolute path for folder: " +folder.getAbsolutePath());
        System.out.println("----------------------------------------------------");

        System.out.println("file.isAbsolute() : " +file.isAbsolute());
        System.out.println("folder.isAbsolute(): " +folder.isAbsolute());
        System.out.println("----------------------------------------------------");

        System.out.println("file.isDirectory() : " +file.isDirectory());
        System.out.println("folder.isDirectory(): " +folder.isDirectory());
        System.out.println("----------------------------------------------------");

        System.out.println("file.exists() : " +file.exists());
        System.out.println("folder.exists(): " +folder.exists());
        System.out.println("file2.exists(): " +file2.exists());
        System.out.println("----------------------------------------------------");

        System.out.println("file2.createNewFile(): " +file2.createNewFile());
        System.out.println("file2.createNewFile(): " +file2.createNewFile());
        System.out.println("folder2.mkdir(): " +folder2.mkdir());
        System.out.println("----------------------------------------------------");

        System.out.println("file.length() : " +file.length());
        System.out.println("folder.length(): " +folder.length());
        System.out.println("----------------------------------------------------");

//        System.out.println("file.delete() : " +file2.delete());
//        System.out.println("folder.delete(): " +folder2.delete());
//        System.out.println("----------------------------------------------------");

        File[] files = folder.listFiles();

        System.out.println(Arrays.toString(files));
        System.out.println("----------------------------------------------------");


        System.out.println("file.isHidden() : " +file.isHidden());
        System.out.println("file.isHidden() : " +file.canRead());
        System.out.println("file.isHidden() : " +file.canWrite());
        System.out.println("file.isHidden() : " +file.canExecute());
        System.out.println("----------------------------------------------------");

        System.out.println("file2.length() : " +file2.length());
    }
}
