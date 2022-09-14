import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square (int xIn) {
        return xIn * xIn;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        input = square(input);
        // Put the result System.out code here.
        System.out.println("input = " + input);
    }
}
