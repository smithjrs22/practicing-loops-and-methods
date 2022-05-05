import java.util.Scanner;

public class PositiveNumbers {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Enter a number:");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Number is " + num);
            if (num == 0){
            System.out.println("Process finished with exit code 0");
                break;
            }
            if (num < 0) {
            System.out.println("Number must be a positive number");
            continue;
            }  
    } 

}
}

    

