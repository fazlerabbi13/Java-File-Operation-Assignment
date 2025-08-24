import java.io.*;
import java.util.*;

public class ReverseFileContent {
     public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        // Read lines from file
        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reverse the order of lines
        Collections.reverse(lines);

        // Write reversed content to new file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("quotes.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Reversed story written to reversed_story.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
