import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        int input = -1;
        while(input <= 0) {
            System.out.print("Enter an integer: ");
            input = inputNumber.nextInt();
        }
        inputNumber.close();


        int sum = 0;
        String inputString = String.valueOf(input);
        int length = inputString.length();

        for(int i = 0; i < length; i++){
            String intSubstring = inputString.substring(i, i+1);
            int intString = Integer.parseInt(intSubstring);

            if(intString % 2 != 0){
                sum = sum + intString;
            }
        }
        System.out.println("\n" + sum + ".");
    }
}