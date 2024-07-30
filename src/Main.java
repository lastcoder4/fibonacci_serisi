import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı Fibonacci sayısını görmek istiyorsunuz? ");
        int n = input.nextInt();

        System.out.println(n + ". Fibonacci sayısı: " + fibonacci(n));

        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
