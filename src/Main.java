//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        // used for providing the value in terminal

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();

        int sum = (a + b)/2;

        System.out.println(sum);



    }
}