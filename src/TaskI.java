import java.util.Scanner;

public class TaskI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int d1 = n / 100;
        int d2 = (n / 10) % 10;
        int d3 = n % 10;

        int sum = d1 + d2 + d3;

        System.out.println(sum);

    }
}
