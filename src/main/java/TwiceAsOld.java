public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        int originDadYears = dadYears;

        if (sonYears == 0) {
            return dadYears;
        }

        if (dadYears > sonYears * 2) {
            while (dadYears != sonYears * 2) {
                dadYears++;
                sonYears++;
            }
        } else {
            while (dadYears != sonYears * 2) {
                dadYears--;
                sonYears--;
            }
        }

        return Math.abs(originDadYears - dadYears);
    }
}