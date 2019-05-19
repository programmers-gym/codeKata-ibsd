import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        return componentRuleResult(getAtomicResults());
    }

    private String[] getAtomicResults() {
        List<RuleEntry> ruleSet = RuleSet.all();
        if (ruleSet != null)
            ruleSet.stream()
                    .map(ruleEntry -> ruleEntry.apply(this.value))
                    .collect(Collectors.toList());
        return new String[]{fizzRuleResult(), buzzRuleResult()};
    }

    private String componentRuleResult(String[] atomicResults) {
        return Arrays.stream(atomicResults)
                .filter(s -> !s.isEmpty())
                .reduce(String::concat)
                .orElse(String.valueOf(this.value));
    }

    private String fizzRuleResult() {
        return (isDividedBy(3)) ? "Fizz" : "";
    }

    private String buzzRuleResult() {
        return (isDividedBy(5)) ? "Buzz" : "";
    }

    private boolean isDividedBy(int i) {
        return this.value % i == 0;
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
