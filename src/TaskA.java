import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        double a;
        double b;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        a = scanner.nextDouble();
        System.out.println();
        b = scanner.nextDouble();
        System.out.println();

        z = Math.sqrt((a*a)+(b*b));
        System.out.println(z);

        scanner.close();

    }
}