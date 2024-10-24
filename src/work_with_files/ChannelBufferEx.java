package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx {

    public static void main(String[] args) {
        try(
                RandomAccessFile raf = new RandomAccessFile("test10.txt", "rw");
                FileChannel channel = raf.getChannel()){


            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder builder = new StringBuilder();
            
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);
                buffer.flip();
                while(buffer.hasRemaining()) {
                   builder.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(builder);

            String text = "\nYa ne blyad patamusha ya ne blyadb i ya ne znayu chto napisatb";

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
