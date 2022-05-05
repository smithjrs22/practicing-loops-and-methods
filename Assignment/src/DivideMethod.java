
import java.util.Scanner;

public class DivideMethod {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        divide(1,3);
    }

    public static void divide(double num1, double num2) {
        System.out.println(num1 + " / " + num2 + " = " + num1/num2);
    }
}
