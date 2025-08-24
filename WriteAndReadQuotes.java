import java.io.*;

public class WriteAndReadQuotes {
    public static void main(String[] args) {
        String[] quotes = {
            "Keep learning!",
            "Believe in yourself.",
            "Consistency is the key to success.",
            "Never give up.",
            "Dream big and work hard."
        };

        // Write quotes to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("quotes.txt"))) {
            for (String quote : quotes) {
                writer.write(quote);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and print quotes with line numbers
        // try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
        //     String line;
        //     int lineNumber = 1;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(lineNumber + ". " + line);
        //         lineNumber++;
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}
