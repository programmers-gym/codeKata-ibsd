import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class WordAnagramsGroup {
    Map<Integer, List<WordCPA>> groups;

    public WordAnagramsGroup() {
        this.groups = new HashMap<>();
    }

    public int count(WordCPA word) {
        List<WordCPA> list = this.groups.get(word.hashCode());

        return list != null ? list.size() : 0;
    }

    public void add(WordCPA word) {
        int key = word.hashCode();
        List<WordCPA> list = this.groups.containsKey(key) ? this.groups.get(key) : new ArrayList<>();
        list.add(word);
        this.groups.put(key, list);
    }

    public String report(WordCPA word) {
        return this.dump(this.groups.get(word.hashCode()));
    }

    public void loadFromFile(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Arrays.stream(line.split(" "))
                    .map(WordCPA::new)
                    .forEach(this::add);
        }
    }

    public int max() {
        return this.groups.values()
                .stream()
                .map(List::size)
                .max(Integer::compareTo)
                .orElse(0);
    }

    public void reportAll(Consumer<String> outer) {
        this.groups.values()
                .stream()
                .filter(wordCPAS -> wordCPAS.size() > 1)
                .map(this::dump)
                .forEach(outer);
    }

    private String dump(List<WordCPA> list) {
        return list.stream()
                .map(WordCPA::toString)
                .sorted()
                .reduce((s, s2) -> s + " " + s2)
                .orElse("");
    }
}
