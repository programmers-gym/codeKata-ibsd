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
                .distinct()
                .reduce(String::concat)
                .orElse(String.valueOf(this.value));
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
