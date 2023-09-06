public class SomaMultiplos {

    public static int somarMultiplos(int x) {
        int soma = 0;

        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int x = 5;

        int resultado = somarMultiplos(x);

        System.out.println("A soma dos múltiplos de 3 ou 5 até " + x + " é: " + resultado);
    }
}
