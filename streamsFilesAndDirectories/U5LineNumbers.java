package streamsFilesAndDirectories;

import java.io.*;

public class U5LineNumbers {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader
                ("resources/resources/inputLineNumbers.txt"));
             PrintWriter pr = new PrintWriter
                     ("resources/resources/Exercises Resources/output.txt")) {
            int lineNum = 1;
            String singleLine = br.readLine();
            while (singleLine != null){
                pr.printf("%d. %s\n", lineNum, singleLine);
                singleLine = br.readLine();
                lineNum++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}