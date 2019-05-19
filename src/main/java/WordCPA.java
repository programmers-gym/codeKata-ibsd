import java.util.Arrays;

public class WordCPA {
    private final String value;

    @Override
    public int hashCode() {
        int result = 0;

        char[] array = this.value.toCharArray();
        Arrays.sort(array);

        return 0;
    }

    public WordCPA(String word) {
        this.value = word;
    }
}
