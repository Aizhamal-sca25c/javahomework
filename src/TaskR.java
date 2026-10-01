import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int remainder = m % n;

        int result = n - remainder;

        System.out.println(result % n);

    }
}
