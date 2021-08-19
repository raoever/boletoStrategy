package padroesDeProjeto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Boleto {
    LeituraRetorno leituraRetorno;
    private int id;
    private String codBanco;
    LocalDate dataVenciamento;
    LocalDateTime dataPagamento;
    private String cpfCliente;
    private double valor, multa, juros;
    private String agencia, contaBancaria;
    public Boleto() {
    }

    public LeituraRetorno getLeituraRetorno() {
        return leituraRetorno;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVenciamento() {
        return dataVenciamento;
    }

    public void setDataVenciamento(LocalDate dataVenciamento) {
        this.dataVenciamento = dataVenciamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "leituraRetorno=" + leituraRetorno +
                ", id=" + id +
                ", codBanco='" + codBanco + '\'' +
                ", dataVenciamento=" + dataVenciamento +
                ", dataPagamento=" + dataPagamento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", juros=" + juros +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}