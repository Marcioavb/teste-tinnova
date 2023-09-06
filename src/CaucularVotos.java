public class CaucularVotos {

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public CaucularVotos(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    public double calcularPercentualVotosValidos() {
        return ((double) votosValidos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosBrancos() {
        return ((double) votosBrancos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosNulos() {
        return ((double) votosNulos / totalEleitores) * 100;
    }

    public static void main(String[] args) {
        int totalEleitores = 1000;
        int votosValidos = 800;
        int votosBrancos = 150;
        int votosNulos = 50;

        CaucularVotos calculadora = new CaucularVotos(totalEleitores, votosValidos, votosBrancos, votosNulos);

        System.out.println("Percentual de votos válidos: " + calculadora.calcularPercentualVotosValidos() + "%");
        System.out.println("Percentual de votos brancos: " + calculadora.calcularPercentualVotosBrancos() + "%");
        System.out.println("Percentual de votos nulos: " + calculadora.calcularPercentualVotosNulos() + "%");
    }
}
