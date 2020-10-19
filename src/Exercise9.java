
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputHeight = 0;
        while (inputHeight <= 0 || inputHeight > 24){
            System.out.print("Height: ");
            inputHeight = in.nextInt();
        }
        in.close();
        int size = inputHeight;
        String[] hastags = new String[size];
        for(int i = 0; i < size; i++){
            hastags[i] = "#";
        }
        System.out.println();



        int build = 2;
        for(int i = 1; i < inputHeight; i++) {
            int spaces = inputHeight - build;

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < build; k++) {
                System.out.print(hastags[k]);
            }
            System.out.print("  ");
            for (int k = 0; k < build; k++) {
                System.out.print(hastags[k]);
            }

            build++;
            System.out.println();
        }
    }
}