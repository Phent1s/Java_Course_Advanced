package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
//        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\aboba\\file\\M");
        Path directoryAPath = Paths.get("C:\\aboba\\file\\A");

//        Files.copy(filePath, directoryPath.resolve(filePath),
//                StandardCopyOption.REPLACE_EXISTING);
////        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//
//        Files.copy(directoryAPath, directoryPath.resolve("A"), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(filePath, directoryPath.resolve("test15.txt"), StandardCopyOption.REPLACE_EXISTING);


//        Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt")), StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("Done!!");

        Files.deleteIfExists(Paths.get("test5.txt"));
    }
}
