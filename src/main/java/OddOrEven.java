import java.util.Arrays;

public class OddOrEven {

    private final static String ODD = "odd";
    private final static String EVEN = "even";

    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array).sum();
        return sum % 2 == 0 ? EVEN : ODD;
    }

}
