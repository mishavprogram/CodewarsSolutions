public class FakeBinary {

    public static final char ZERO = '0';
    public static final char ONE = '1';

    public static String fakeBin(String numberString) {

        String result = numberString
                .replace('1', ZERO)
                .replace('2', ZERO)
                .replace('3', ZERO)
                .replace('4', ZERO);

        result = result
                .replace('5', ONE)
                .replace('6', ONE)
                .replace('7', ONE)
                .replace('8', ONE)
                .replace('9', ONE);

        return result;
    }
}
