import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int diff = a - b;

        int sign = (diff >>> 31) & 1;

        int max = a - sign * diff;

        System.out.println(max);

    }
}
