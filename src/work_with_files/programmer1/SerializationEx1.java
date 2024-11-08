package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Alex Werstapen");
        employees.add("Odlsafw dapkdw");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employees);

            System.out.println("Done!");
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
