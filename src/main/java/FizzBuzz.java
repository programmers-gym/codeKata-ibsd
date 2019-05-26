import java.util.List;

public class FizzBuzz {
    private final int value;

    public FizzBuzz(int i) {
        this.value = i;
    }

    public String apply(List<RuleEntry> ruleSet) {
        return ruleSet.stream()
                .map(ruleEntry -> ruleEntry.apply(this.value))
                .filter(s -> !s.isEmpty())
                .distinct()
                .reduce(String::concat)
                .orElse(String.valueOf(this.value));
    }
}
