public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        if (isDividedBy(15)) return "FizzBuzz";
        if (isDividedBy(3)) return "Fizz";
        if (isDividedBy(5)) return "Buzz";
        return String.valueOf(this.value);
    }

    private boolean isDividedBy(int i) {
        return this.value % i == 0;
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
