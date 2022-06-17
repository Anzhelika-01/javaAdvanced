package streamsFilesAndDirectories;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class U6WordCount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader
                ("resources/resources/words.txt"));
             Scanner textSc = new Scanner(new FileReader
                     ("resources/resources/text.txt"));
             PrintWriter pr = new PrintWriter
                     ("resources/resources/Exercises Resources/results.txt")) {

            Map<String, Integer> wordMap = new LinkedHashMap<>();
            Arrays.stream(sc.nextLine().split(" "))
                    .forEach(word -> wordMap.put(word, 0));

            while (textSc.hasNext()){
                String textInput = textSc.next();
                if (wordMap.containsKey(textInput)){
                    int occurrences = wordMap.get(textInput);
                    occurrences++;
                    wordMap.put(textInput, occurrences);
                }
            }
            wordMap.forEach((key, value) -> pr.printf("%s - %d\n"
                    , key, value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}