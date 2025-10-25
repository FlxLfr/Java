import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your credit balance");
    float A = sc.nextFloat();

        if (A >= 1000.0) {
            System.out.println("Congratulations your rich!");
        }
        else if (A > 0) {
            System.out.println("Atleast its positive");
        }
        else if (A == 0) {
            System.out.println("Time for Lunch!");
            System.out.println("New bank balance = 20.3 Euros");
        }
        else if (A > -1000) {
            System.out.println("Oh no, its negative :(");
        }
        else {
            System.out.println("Bankruptcy has been officially declared, HA HA !!");
        }
    }
}
