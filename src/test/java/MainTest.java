import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void name() {
        WordCPA word1 = new WordCPA("ab");
        WordCPA word2 = new WordCPA("ba");
        assertEquals(word1.hashCode(), word2.hashCode());
    }
}
