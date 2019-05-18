public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
