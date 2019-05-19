import java.util.Arrays;
import java.util.List;

public class RuleSet {
    public static List<RuleEntry> all() {
        return Arrays.asList(
                DivideRule.create(3, "Fizz"),
                DivideRule.create(5, "Buzz")
        );
    }
}
