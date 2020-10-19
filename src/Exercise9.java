
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner inputHeight = new Scanner(System.in);
        int userHeight = 0;
        while (userHeight <= 0 || userHeight > 24){
            System.out.print("Height: ");
            userHeight = inputHeight.nextInt();
        }
        inputHeight.close();
        int size = userHeight;
        String[] starP = new String[size];
        for(int i = 0; i < size; i++){
            starP[i] = "#";
        }
        System.out.println();
        int build = 2;
        for(int i = 1; i < userHeight; i++) {
            int spaces = userHeight - build;

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < build; k++) {
                System.out.print(starP[k]);
            }
            System.out.print("  ");
            for (int k = 0; k < build; k++) {
                System.out.print(starP[k]);
            }
            build++;
            System.out.println();
        }
    }
}