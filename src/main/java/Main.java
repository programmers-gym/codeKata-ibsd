import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WordAnagramsGroup group = new WordAnagramsGroup();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
        group.loadFromFile("wordlist.txt");

        System.out.println(group.max());
        group.reportAll(System.out::println);
        group.reportAll(s -> {
            try {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
