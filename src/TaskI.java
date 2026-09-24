import java.util.Scanner;

public class TaskI {
    static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        System.out.println(a + b + c);


    }
}
