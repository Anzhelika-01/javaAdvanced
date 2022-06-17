package streamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class U7MergeTwoFiles {
    public static void main(String[] args) {
        Path pathOne = Paths.get("resources/resources/inputOne.txt");
        Path pathTwo = Paths.get("resources/resources/inputTwo.txt");
        Path pathOut = Paths.get("resources/resources/merge.txt");

        try {
            List<String> firstFile = Files.readAllLines(pathOne);
            List<String> secondFile = Files.readAllLines(pathTwo);

            Files.write(pathOut, firstFile, StandardOpenOption.APPEND);
            Files.write(pathOut, secondFile, StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}