public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        if (isDividedBy(15)) return "FizzBuzz";

        String result1 = fizzRuleResult();
        if (!result1.isEmpty()) return result1;

        String result2 = buzzRuleResult();
        if (!result2.isEmpty()) return result2;

        String[] atomicResults = new String[]{result1, result2};
        String componentResult = componentRuleResult(atomicResults);
        return String.valueOf(this.value);
    }

    private String componentRuleResult(String[] atomicResults) {
        return "";
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
