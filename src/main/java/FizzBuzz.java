public class FizzBuzz {
    private final int value;

    @Override
    public String toString() {
        if (this.value % 3 == 0) return "Fizz";
        if (this.value % 5 == 0) return "Buzz";
        return String.valueOf(this.value);
    }

    public FizzBuzz(int i) {
        this.value = i;
    }
}
