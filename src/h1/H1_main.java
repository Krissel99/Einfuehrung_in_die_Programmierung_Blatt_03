package h1;

public class H1_main {
    public static void main(String[] args) {

        double guthaben = -100, monEingang = 200;
        int rating = -2;
        boolean warnhinweis, negativ;

        if (guthaben < 0) {
            negativ = true;
            if (Math.abs(monEingang) >= guthaben) {
                rating += 1;
            }
            if (Math.abs(monEingang) < guthaben) {
                rating -= 1;
            }
        } else {
            negativ = false;
        }
        if (guthaben > 0) {
            rating += 3;
        }
        if (guthaben == 0) {
            rating += 2;
        }
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating == -2) {
            negativ = true;
            warnhinweis = true;
        } else warnhinweis = false;
        System.out.println("Guthaben: " + guthaben);
        System.out.println("Mon Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);
        System.out.println("Warnhinweis: " + warnhinweis);
    }
}
