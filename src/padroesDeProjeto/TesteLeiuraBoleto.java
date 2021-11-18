package padroesDeProjeto;

public class TesteLeiuraBoleto {
    public static void main(String[] args) {
//        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBB());
        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBradesco());
        String nomeArquivo="";
        try {
//            nomeArquivo = TesteLeiuraBoleto.class.getResource("/banco-brasil-1.csv").getPath();
            nomeArquivo = TesteLeiuraBoleto.class.getResource("/bradesco-1.csv").getPath();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }

        System.out.println("Lendo arquivo " + nomeArquivo + "\n");
        processador.processar(nomeArquivo);
    }
}
