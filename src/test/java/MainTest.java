import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void should_return_1_when_input_1() {
        FizzBuzz item = new FizzBuzz(1);
        assertEquals("1", item.toString());
    }
}
