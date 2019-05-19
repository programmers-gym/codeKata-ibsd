import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("wordlist.txt"));
    }
}
