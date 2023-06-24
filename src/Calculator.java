import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator started");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        boolean userWantToContinue = true;

        while (userWantToContinue) {
            calculate(scanner);

            System.out.println("Do you want to continue?");
            System.out.println("Enter Y to continue");
            System.out.println("Enter N to finish");
            String action = scanner.next();

            if (action.equals("Y")) {
                userWantToContinue = true;
            } else if (action.equals("N")) {
                userWantToContinue = false;
            }
        }

        scanner.close();

    }

    public static void calculate(Scanner scanner) {
        printInfo();

        String action = scanner.next();
        if (action.length() != 1) {
            return;
        }

        float a = getNumberFromUser(scanner, "first");
        float b = getNumberFromUser(scanner, "second");

        DecimalFormat format = new DecimalFormat("#0.00");
        if (action.equals("/")) {
            if (b == 0) {
                System.out.println("You can`t divide by zero");
                return;
            }
            System.out.println("a / b = " + format.format(a / b));
        } else if (action.equals("*")) {
            System.out.println("a * b = " + format.format(a * b));
        } else if (action.equals("-")) {
            System.out.println("a - b = " + format.format(a - b));
        } else if (action.equals("+")) {
            System.out.println("a + b = " + format.format(a + b));
        } else {
            System.out.println("Incorrect action");
        }
    }

    public static float getNumberFromUser(Scanner scanner, String numberName) {
        System.out.println("Please enter " + numberName + " number");
        String aStr = scanner.next();
        return (float) Float.valueOf(aStr.replace(",", "."));
    }

    public static void printInfo() {
        System.out.println("Enter / to divide");
        System.out.println("Enter * to multiply");
        System.out.println("Enter + to add");
        System.out.println("Enter - to minus");
    }
}
