package march_april;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] fullName = name.split(" ");

        String firstName = fullName[0];
        String lastName = fullName[1];

        return String.valueOf(firstName.charAt(0)).toUpperCase() +
                "." +
                String.valueOf(lastName.charAt(0)).toUpperCase();
    }

}
