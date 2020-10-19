import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        long given = input.nextLong();
        String number = Long.toString(given);
        int length = number.length();
        int temp1  = 0;
        int temp2 = 0;
        int totalSum;
        for (int k = length-2; k >= 0; k -=2) {
            char value = number.charAt(k);
            int intValue = Character.getNumericValue(value) * 2;
            if (intValue >= 10) {
                int tens = intValue/10;
                int ones = intValue % 10;
                temp1 = temp1 + tens + ones;
            }
            else {
                temp1 = temp1 + intValue;
            }
        }
        for (int m = length -1; m >= 0; m -=2) {
            char value = number.charAt(m);
            int intValue = Character.getNumericValue(value);
            temp2 = temp2 + intValue;
        }
        totalSum = temp1 + temp2;
        if (totalSum % 10 == 0) {
            if (((number.startsWith("34")) || (number.startsWith("37"))) && (length == 15)) {
                System.out.println(" ");
                System.out.println("American Express.");
            }
            else if (((number.startsWith("51")) || (number.startsWith("52")) || (number.startsWith("53")) || (number.startsWith("54")) || (number.startsWith("55"))) && (length == 16)) {
                System.out.println(" ");
                System.out.println("Mastercard.");
            }
            else if ((number.charAt(0) == '4') && ((length == 13) || (length == 16))) {
                System.out.println(" ");
                System.out.println("Visa.");
            }
            else {
                System.out.println(" ");
                System.out.println("Invalid.");
            }
        }
        else {
            System.out.println("Invalid.");
        }
        input.close();
    }
}