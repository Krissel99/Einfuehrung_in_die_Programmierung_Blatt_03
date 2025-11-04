package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5, fix = 2, wartend = 2;
        boolean istVoll;

        if (fix < max && wartend > 0) {
            int a = max - fix;
            if (a > wartend) {
                fix += wartend;
                wartend = 0;
            } else {
                fix = max;
                wartend -= a;
            }
        }

        istVoll = (fix == max);

        System.out.println("fix = " + fix);
        System.out.println("wartend = " + wartend);
        System.out.println("istVoll = " + istVoll);
    }
}
