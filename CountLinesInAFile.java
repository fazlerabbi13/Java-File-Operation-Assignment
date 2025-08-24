import java.io.*;
public class CountLinesInAFile {
     public static void main(String[] args) {
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Total number of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
