import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("The next number for the number " + x + " is " + (x +1) + ".");
        System.out.println("The next number for the number "  +  x +   " is " + (x-1) + ".");

        scanner.close();
    }
}
