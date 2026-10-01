import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int totalKopeyki = (a * 100 + b) * n;

        int totalRubli = totalKopeyki / 100;
        int remainingKopecks = totalKopeyki % 100;

        System.out.println(totalRubli  + " " + remainingKopecks);
    }
}
