import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordAnagramsGroup {
    Map<Integer, List<WordCPA>> groups;

    public WordAnagramsGroup() {
        this.groups = new HashMap<>();
    }

    public int count() {

        return 3;
    }

    public void add(WordCPA word) {
        int key = word.hashCode();
        if (this.groups.containsKey(key)) {

        } else {
            List<WordCPA> list = new ArrayList<>();
            list.add(word);
            this.groups.putIfAbsent(key, list);
        }
    }
}
