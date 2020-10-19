import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt for lowerBound and upperBound inputs
        int lowerBound;
        int upperBound;

        do {
            System.out.print("Lower bound: ");
            lowerBound = input.nextInt();
            System.out.print("Upper bound: ");
            upperBound = input.nextInt();
        } while (upperBound < lowerBound);


        //calculate the sum of even integers
        int sum = 0;

        for (int x = lowerBound; x <= upperBound; x++ ){
            //excludes odd numbers
            if (x % 2 == 0){
                sum += x;
            }
        }


        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.print("\n" + df2.format(sum) + ".");

        input.close();
    }
}