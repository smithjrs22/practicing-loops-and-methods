import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to leave?");
            String userInput = input.nextLine();
            if (userInput.equals("yes")) {
                break;
            }
        }
    }
}
