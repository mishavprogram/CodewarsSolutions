package march_april;

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            builder.append(string);
        }

        return builder.toString();
    }

}
