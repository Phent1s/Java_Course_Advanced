package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\aboba\\file\\X");
        Path destination = Paths.get("C:\\aboba\\file\\CopyHere");
        Files.walkFileTree(source, new MyFileVisitor(source, destination));
        System.out.println("Done!");
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }

}
