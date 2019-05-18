public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        if (this.value % 3 == 0) return "Fizz";
        return String.valueOf(this.value);
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
