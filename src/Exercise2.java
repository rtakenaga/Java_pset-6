import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        
        Double input = 0.0;

        while(input <= 0) {
            System.out.print("Enter an Integer: ");
            input = inputInt.nextDouble();
        }

        inputInt.close();
        System.out.println(" ");



        int inputInteger = input.intValue();
        String digits = String.valueOf(inputInteger);
        int length = digits.length();

        for(int i = length-1; i > -1; i--) {
            String subInteger = digits.substring(i, i+1);

            if(i == 0){
                System.out.print(subInteger + ". ");
            }
            else {
                System.out.print(subInteger  + ", ");
            }
        }
    }
}