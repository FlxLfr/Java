import java.util.Scanner;


public class Task4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to calculate the factorial from");
        long A = sc.nextLong();
        long OriginalA = A;
        long B = 1;
        if (A < 0) {
            System.out.println("Negative numbers are not factoriable");
        }
        else if (A == 0) {
            System.out.println("The factorial number of 0 is 1");
        }

        else {
            while (A > 0){
                B = B * A;
                A--;
            }
            System.out.print("The factorial of " + OriginalA + " is = " + B);
        }
    }
}
