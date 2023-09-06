import java.util.Scanner;

public class Fatorial {

    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            int resultado = calcularFatorial(numero);
            System.out.println(numero + "! = " + resultado);
        } else {
            System.out.println("O fatorial não é definido para números negativos.");
        }
    }
}
