package aulas.aulaAC;

public class Dependente {
    private String nome;
    private double gastoEducacaoAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGastoEducacaoAnual() {
        return gastoEducacaoAnual;
    }

    public void setGastoEducacaoAnual(double gastoEducacaoAnual) {
        this.gastoEducacaoAnual = gastoEducacaoAnual;
    }

    public Dependente(String nome, double gastoEducacaoAnual) {
        this.nome = nome;
        this.gastoEducacaoAnual = gastoEducacaoAnual;
    }
}
