import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer= 0;
        int input;

        do {
            System.out.print("Enter an integer: ");
            input = in.nextInt();
        }

        while (input < 0);
        for (int k = 2; k <= Math.sqrt(input); k++) {
            if (input % k == 0) {
                integer = k;
                break;
            }
        }

        if (integer != 0) {
            System.out.println(" ");
            System.out.println("Not prime.");
        } else {
            System.out.println(" ");
            System.out.println("Prime.");
        }
        in.close();
    }
}