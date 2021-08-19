package padroesDeProjeto;

public class TesteLeiuraBoleto {
    public static void main(String[] args) {
        LeituraRetorno l1 = new LeituraRetornoBradesco();
        LeituraRetorno l2 = new LeituraRetornoBB();
        l1.ler();
        l2.ler();
    }
}
