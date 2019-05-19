import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void test_ab_ba() {
        WordCPA word1 = new WordCPA("ab");
        WordCPA word2 = new WordCPA("ba");
        assertEquals(word1.hashCode(), word2.hashCode());
    }

    @Test
    void test_abc_bac_cab() {
        WordCPA word1 = new WordCPA("abc");
        WordCPA word2 = new WordCPA("bac");
        WordCPA word3 = new WordCPA("cba");
        assertEquals(word1.hashCode(), word2.hashCode());
        assertEquals(word3.hashCode(), word2.hashCode());
        assertEquals(word1.hashCode(), word3.hashCode());
    }

    @Test
    void test_word_group_count() {
        WordCPA word1 = new WordCPA("abc");
        WordCPA word2 = new WordCPA("bac");
        WordCPA word3 = new WordCPA("cba");

        WordAnagramsGroup group = new WordAnagramsGroup();
        assertEquals(3, 3);
    }
}
