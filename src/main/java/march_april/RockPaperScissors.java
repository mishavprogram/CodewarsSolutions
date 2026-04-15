package march_april;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        String str1 = "rock";
        String str2 = "scissors";
        String str3 = "paper";

        List<String> input = new ArrayList<>();
        input.add(p1);
        input.add(p2);

        String message1 = "Player ";
        String message2 = " won!";
        String message3 = "Draw!";
        String winner = null;

        if (input.contains(str1) && input.contains(str2)) {
            winner = str1;
        } else if (input.contains(str2) && input.contains(str3)) {
            winner = str2;
        } else if (input.contains(str3) && input.contains(str1)) {
            winner = str3;
        }
        ;

        if (winner != null) {
            StringBuilder builder = new StringBuilder();
            builder.append(message1);

            if (winner.equals(p1))
                builder.append("1");
            else builder.append("2");

            builder.append(message2);
            return builder.toString();
        } else {
            return message3;
        }
    }

}
