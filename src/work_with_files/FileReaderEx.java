package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {

        try(FileWriter writer = new FileWriter("test2.txt", true);
            FileReader reader = new FileReader("test2.txt")) {
            int character;
            while ((character = reader.read())!=-1){
                System.out.print((char)character);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
