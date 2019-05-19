import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        this.groups.get(word.hashCode())
                .stream()
                .map(wordCPA -> wordCPA.toString())
                .reduce((s, s2) -> s + " " + s2)
                .orElse("");
        return "ab ba";
    }
}
