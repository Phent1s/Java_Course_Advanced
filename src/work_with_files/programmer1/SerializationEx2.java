package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tida", "Whitee");
        Employee employee = new Employee("Maria", "IT", 28, 5000, car);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees2.bin"));) {
            oos.writeObject(employee);
            System.out.println("Done!");
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
  }
