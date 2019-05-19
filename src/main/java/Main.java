import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("wordlist.txt"));
        WordAnagramsGroup group = new WordAnagramsGroup();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Arrays.stream(line.split(" "))
                    .map(WordCPA::new)
                    .forEach(group::add);
        }
    }
}
