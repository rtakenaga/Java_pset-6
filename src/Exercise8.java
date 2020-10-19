
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int inputHeight = 0;
        while (inputHeight <= 0 || inputHeight > 24){
            System.out.print("Height: ");
            inputHeight = in.nextInt();
        }
        in.close();

        int size = inputHeight + 1;
        String[] hashtags = new String[size];
        for(int i = 0; i < size; i++){
            hashtags[i] = "#";
        }
        
        System.out.println();
        int build = 2;
        for(int i = 1; i < inputHeight + 1; i++){
            int spaces = inputHeight - build;

            for (int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < build; k++){
                System.out.print(hashtags[k]);
            }
            build++;

            System.out.println();
        }
    }
}