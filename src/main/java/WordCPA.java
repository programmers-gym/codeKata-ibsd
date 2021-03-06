import java.util.Arrays;

public class WordCPA {
    private final String value;

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public int hashCode() {
        char[] array = this.value.toCharArray();
        Arrays.sort(array);
        return Arrays.hashCode(array);
    }

    public WordCPA(String word) {
        this.value = word;
    }
}
