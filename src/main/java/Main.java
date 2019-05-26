import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RuleEntry> ruleSet = RuleSet.all();
        Game game = new Game(ruleSet);
        game.play(100);
    }
}
