
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner inputHeight = new Scanner(System.in);
        int userHeight = 0;
        while (userHeight <= 0 || userHeight > 24){
            System.out.print("Height: ");
            userHeight = inputHeight.nextInt();
        }
        inputHeight.close();

        int size = userHeight + 1;
        String[] pArray = new String[size];
        for(int i = 0; i < size; i++){
            pArray[i] = "#";
        }
        System.out.println();
        int build = 2;
        for(int i = 1; i < userHeight + 1; i++){
            int spaces = userHeight - build;

            for (int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < build; k++){
                System.out.print(pArray[k]);
            }
            build++;
            System.out.println();
        }
    }
}