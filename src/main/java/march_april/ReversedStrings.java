package march_april;

public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

}
