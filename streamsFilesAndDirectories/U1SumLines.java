package streamsFilesAndDirectories;

import java.io.*;

public class U1SumLines {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader
                ("resources/resources/input.txt"))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                char[] charactersFromLine = line.toCharArray();
                for (char singleCharacter : charactersFromLine) {
                    sum += singleCharacter;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}