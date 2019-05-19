public class DivideRule implements RuleEntry {
    private final int input;
    private final String output;

    public DivideRule(int in, String out) {
        this.input = in;
        this.output = out;
    }

    public static RuleEntry create(int in, String out) {
        return new DivideRule(in, out);
    }

    @Override
    public String apply(int value) {
        if (value % this.input == 0) return this.output;
        return "";
    }
}
