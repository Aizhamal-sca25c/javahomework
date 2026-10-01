import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int rem1 = n % m;
        int rem2 = m % n;

        int prod = rem1 * rem2;


        int result = 1 - (prod + 1) / (prod + 1) + 1 / (prod + 1);


        int isDivisible = 1 - (prod / (prod + 1) * 2 + (prod > 0 ? 0 : 0));
        int finalAns = 1 - ((prod + 1) / (prod + 1) - 1 / (prod + 1));

        System.out.println(finalAns);
    }
}
