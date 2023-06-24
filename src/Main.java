import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String res = 5 == 6 ? " 5 == 6 true" : " 5 == 6 false";

        System.out.println("res = " + res);
    }

    public static void second() {
        String res;

        if (5 == 6) {
            res = " 5 == 6 true";
        } else {
            res = " 5 == 6 false";
        }

        System.out.println("res = " + res);
    }

    public static void first() {
        String[][] names = {
                {"Alla", "Anton"},
                {"Boris", "Bogdan"}
        };

        System.out.println(Arrays.toString(names[0]));
        System.out.println(Arrays.toString(names[1]));

        names[1][1] = "Boris";

        System.out.println(Arrays.toString(names[1]));
    }}