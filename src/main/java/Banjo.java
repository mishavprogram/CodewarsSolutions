public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("R") || name.startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}