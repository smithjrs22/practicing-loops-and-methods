
import java.util.Scanner;

public class DivideMethod {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        division(1,3);
    }

    public static void division(double num1, double num2) {
        System.out.println(num1 + " / " + num2 + " = " + num1/num2);
    }
}
