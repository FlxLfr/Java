import java.util.Arrays;

public class Task1 {
    public static void main(String args[]) {
        boolean A = true;
        char B = 'A';
        byte C = -126;
        short D = -32767;
        int E = -2147483647;
        long F = 922337203685412213L;
        float G = 3.14f;
        double H = 9.81;
        String I = "ASDASD";
        int[] J = {1, 2, 3, 4, 5};

        System.out.println("These are the different data types within Java, including the string an the array int function:");
        System.out.println("Boolean = "+A);
        System.out.println("Char = " +B);
        System.out.println("Byte = " +C);
        System.out.println("Short = "+ D);
        System.out.println("Integer = " +E);
        System.out.println("Long = " +F);
        System.out.println("Float = " +G);
        System.out.println("Double = " +H);
        System.out.println("String  = " +I);
        System.out.println("Integer Array = "+ Arrays.toString(J));
        System.out.print("Integer Array reversed = [");
        for (int i = J.length - 1; i >= 0; i--) {
            System.out.print(J[i] + ", ");
        }
        System.out.print("]");
    }
}
