import java.util.Scanner;


public class TaskS {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int x = h-a;
        int up = a-b;
        int days = 0;

        if (up>=h) days=0;
        else if (x % up == 0) days = x / up;
        else days = x/up + 1;

        System.out.println(days + 1);
    }
}
