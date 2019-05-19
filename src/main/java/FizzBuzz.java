import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        return componentRuleResult(getAtomicResults());
    }

    private List<String> getAtomicResults() {
        List<RuleEntry> ruleSet = RuleSet.all();
        return ruleSet.stream()
                .map(ruleEntry -> ruleEntry.apply(this.value))
                .collect(Collectors.toList());
    }

    private String componentRuleResult(List<String> atomicResults) {
        return atomicResults.stream()
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
