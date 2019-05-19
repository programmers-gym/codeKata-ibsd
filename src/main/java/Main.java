import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("wordlist.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {

        }
    }
}
