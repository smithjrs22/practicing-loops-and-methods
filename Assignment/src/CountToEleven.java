import java.util.Scanner;
public class CountToEleven {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter number less than 11");
            int num =  Integer.valueOf(input.nextLine());
                if (num <= 11){
                for (int i = num; i <= 11; i++)
                System.out.println(i);
                }
        }
    }
}
