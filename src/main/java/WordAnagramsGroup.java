import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
        if (this.groups.containsKey(key)) {
            List<WordCPA> list = this.groups.get(key);
            list.add(word);
            this.groups.put(key, list);
        } else {
            List<WordCPA> list = new ArrayList<>();
            list.add(word);
            this.groups.putIfAbsent(key, list);
        }
    }

    public String report(WordCPA word) {
        return this.groups.get(word.hashCode())
                .stream()
                .map(WordCPA::toString)
                .sorted()
                .reduce((s, s2) -> s + " " + s2)
                .orElse("");
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
}
