public class ContainsRule implements RuleEntry {
    private final int input;
    private final String output;

    public ContainsRule(int in, String out) {
        this.input = in;
        this.output = out;
    }

    public static RuleEntry create(int in, String out) {
        return new ContainsRule(in, out);
    }

    @Override
    public String apply(int value) {
        return String.valueOf(value).contains(String.valueOf(this.input)) ? this.output : "";
    }
}
