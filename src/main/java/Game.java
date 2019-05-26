import java.util.List;

public class Game {
    private final List<RuleEntry> ruleSet;

    public Game(List<RuleEntry> ruleSet) {
        this.ruleSet = ruleSet;
    }

    public void play(int count) {
        for (int i = 0; i < count; i++) {
            FizzBuzz item = new FizzBuzz((i + 1));
            System.out.println(item.apply(this.ruleSet));
        }
    }
}
