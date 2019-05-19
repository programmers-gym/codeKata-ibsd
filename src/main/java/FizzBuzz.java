import java.util.Arrays;

public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        String result1 = fizzRuleResult();
        String result2 = buzzRuleResult();
        String[] atomicResults = new String[]{result1, result2};

        return componentRuleResult(atomicResults);
    }

    private String componentRuleResult(String[] atomicResults) {
        return Arrays.stream(atomicResults)
                .filter(s -> !s.isEmpty())
                .reduce(String::concat)
                .orElse(String.valueOf(this.value));
    }

    private String fizzRuleResult() {
        if (isDividedBy(3)) return "Fizz";
        return "";
    }

    private String buzzRuleResult() {
        if (isDividedBy(5)) return "Buzz";
        return "";
    }

    private boolean isDividedBy(int i) {
        return this.value % i == 0;
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
