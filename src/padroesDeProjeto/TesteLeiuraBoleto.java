package padroesDeProjeto;

public class TesteLeiuraBoleto {
    public static void main(String[] args) {
        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBB());
        String nomeArquivo = TesteLeiuraBoleto.class.getResource("banco-brasil-1.csv").getPath();
        System.out.println("Lendo arquivo " + nomeArquivo + "\n");
        processador.processar(nomeArquivo);
    }
}
