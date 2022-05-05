import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(input.nextLine());
            if (userInput == 5) {
                System.out.println("Process finished with exit code 0");
                break;
            } 
        }
    }
}
