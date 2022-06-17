package streamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class U2SumBytes {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("resources/resources/input.txt"))) {
            String singleLine = bufferedReader.readLine();
            long sum = 0;
            while (singleLine != null) {
                char[] ascii = singleLine.toCharArray();
                for (char c : ascii) {
                    sum += c;
                }
                singleLine = bufferedReader.readLine();
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}