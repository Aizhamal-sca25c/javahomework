import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int hours = (n % 1440) / 60;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);

    }
}
