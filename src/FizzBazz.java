public class FizzBazz {
    public static void main(String[] args) {
        int i = 31;

        if (i % 5 == 0 && i % 3 == 0) {
            System.out.println(i + " -> FIZZ-BAZZ");
        } else if (i % 3 == 0) {
            System.out.println(i + " -> FIZZ");
        } else if (i % 5 == 0) {
            System.out.println(i + " -> BAZZ");
        } else {
            System.out.println(i + " non FIZZ non BAZZ");
        }
    }

}
