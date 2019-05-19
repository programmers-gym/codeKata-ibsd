import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz",
    })
    void should_test_fizz_buzz(int input, String output) {
        FizzBuzz item = new FizzBuzz(input);
        assertEquals(output, item.toString());
    }
}
