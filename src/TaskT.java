import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        int diff = Math.abs(d1 - d4) + Math.abs(d2 - d3);

        System.out.println(1 - (diff + n) / (diff + 1) + (n / (diff + 1)));

    }
}
