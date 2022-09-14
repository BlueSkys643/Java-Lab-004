import java.util.Scanner;
import static java.lang.Math.PI;


public class Radians {

    public static double toRadians(double degrees) {
        return degrees * PI / 180;
    }

    public static double toDegrees(double radians) {
        return radians * 180 / PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        degrees = toRadians(degrees);
        System.out.println("Radians = " + degrees);

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        radians = toDegrees(radians);
        System.out.println("Degrees = " + radians);

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
