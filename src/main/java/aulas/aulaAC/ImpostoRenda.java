package aulas.aulaAC;

public class ImpostoRenda {

    private double rendaMensal;
    private int dependentes;
    private double despesasMedicas;
    private double previdenciaPrivada;
    private double despesasEstudantis;

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getDespesasMedicas() {
        return despesasMedicas;
    }

    public void setDespesasMedicas(double despesasMedicas) {
        this.despesasMedicas = despesasMedicas;
    }

    public double getPrevidenciaPrivada() {
        return previdenciaPrivada;
    }

    public void setPrevidenciaPrivada(double previdenciaPrivada) {
        this.previdenciaPrivada = previdenciaPrivada;
    }

    // ajustar função que calcula IRPF
    public double calcularImposto() {
        if (rendaMensal <= 0) {
            return 0.0;
        }

        double deducaoDependentes = dependentes * 189.59;
        double deducaoMedica = Math.min(despesasMedicas, 3000.0);
        double deducaoPrevidencia = Math.min(previdenciaPrivada, 1200.0);

        double baseCalculo = rendaMensal - deducaoDependentes - deducaoMedica - deducaoPrevidencia;

        if (baseCalculo <= 2000) {
            return 0.0;
        }

        double imposto;

        if (baseCalculo <= 3000) {
            imposto = baseCalculo * 0.075;
        } else if (baseCalculo <= 5000) {
            imposto = baseCalculo * 0.15;
        } else if (baseCalculo <= 7000) {
            imposto = baseCalculo * 0.225;
        } else {
            imposto = baseCalculo * 0.275;
        }

        // Penalidade por não declarar previdência
        if (previdenciaPrivada == 0 && baseCalculo > 5000) {
            imposto += 100; // multa fictícia
        }

        // Isenção extra se tiver mais de 3 dependentes e renda baixa
        if (dependentes >= 3 && rendaMensal <= 3500) {
            imposto *= 0.9; // 10% de desconto
        }

        return imposto;
    }
}
