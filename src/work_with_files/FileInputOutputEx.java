package work_with_files;

import java.io.*;

public class FileInputOutputEx {


    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\happi\\Downloads\\DALL·E 2024-10-14 20.31.37 - A dynamic and intense avatar for a Dota 2 player, inspired by ZXC style. The image features a dark, edgy atmosphere with neon-colored accents, sharp l.webp");
             FileOutputStream outputStream = new FileOutputStream("filee.webp");
        ) {
            int i;
            while((i=inputStream.read())!=-1){
                outputStream.write(i);
            }

            System.out.println("Dddonee!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
