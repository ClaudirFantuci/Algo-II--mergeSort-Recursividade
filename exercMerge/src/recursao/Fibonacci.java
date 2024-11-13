package recursao;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int resultado = fibonacci(n);
        System.out.println("O " + n + " termo da sequência de Fibonacci é: " + resultado);
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
