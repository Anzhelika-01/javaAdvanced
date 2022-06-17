package streamsFilesAndDirectories;

import java.io.*;

public class U4CountCharacterTypes {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader
                (new FileReader("resources/resources/input.txt"));
             PrintWriter pr = new PrintWriter
                     ("resources/resources/Exercises Resources/output.txt")) {
            String singleLine = br.readLine();
            int vowelsCount = 0;
            int punctuationMarks = 0;
            int consonant = 0;

            while (singleLine != null) {
                String[] letter = singleLine.split("");

                for (String s : letter) {
                    switch (s) {
                        case "a", "e", "i", "o", "u":
                            vowelsCount++;
                            break;
                        case "!", ",", ".", "?":
                            punctuationMarks++;
                            break;
                        case " ":
                            break;
                        default:
                            consonant++;
                    }
                }
                singleLine = br.readLine();
            }
            pr.println("Vowels: " + vowelsCount);
            pr.println("Consonants: " + consonant);
            pr.println("Punctuation: " + punctuationMarks);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}