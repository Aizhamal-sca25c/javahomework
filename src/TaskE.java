import java.util.Scanner;

public class TaskE{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int t = in.nextInt();

        int position = (v * t) % 109;
        int result = (position + 109) % 109;

        System.out.println(result);



    }
}
