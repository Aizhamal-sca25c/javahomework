import java.util.Scanner;

public class TaskH{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println((n / 10) % 10);
    in.close();

    }
}