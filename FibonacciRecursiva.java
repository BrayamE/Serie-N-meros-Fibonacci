import java.util.Scanner;

public class FibonacciRecursiva {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Brayam Edwin Quispe Apaza");
        System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");
        int limite = scanner.nextInt();
        scanner.close();

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }
}
