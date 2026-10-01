import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Если одно число делится на другое, то хотя бы один из остатков равен 0,
        // следовательно, их произведение будет равно 0, и программа выведет 1.
        // Если ни одно не делится, произведение будет больше 0, и программа выведет число, отличное от 1.
        int result = 1 + (n % m) * (m % n);

        System.out.println(result);
    }
}