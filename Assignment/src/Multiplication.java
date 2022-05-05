import java.util.Scanner;
public class Multiplication {
    public static void main (String[] arg) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input a number");
    int num =  Integer.valueOf(input.nextLine());
    for (int i = 1; i <= 10; i++){
        System.out.println(num + " X " + i + " = " + num*i); 
        }
    }
}
