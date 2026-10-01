import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();

        int odd = n / 2;
        int even = (n - 1) / 2;

        int total = n * 45 + odd * 5 + even * 15;

        int hours = 9 + total / 60;
        int minutes = total  % 60;

        System.out.println(hours + " " + minutes);

    }
}
