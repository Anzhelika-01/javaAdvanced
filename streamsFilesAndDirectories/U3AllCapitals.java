package streamsFilesAndDirectories;

import java.io.*;

public class U3AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("resources/resources/input.txt"));
             PrintWriter printWriter = new PrintWriter(new FileWriter
                     ("resources/resources/Exercises Resources/output.txt"))) {
            bufferedReader.lines().forEach(line ->
                    printWriter.println(line.toUpperCase()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}