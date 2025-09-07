package aulas.aulaAC;

public class ImpostoRenda {

    private double rendaAnualBruta;
    private double contribuicaoINSS;
    private int dependentes;
    private double despesasMedicas;
    private double previdenciaPrivada;
    private double despesasEstudantis;
    private double pensaoAlimenticiaAnual;

    public double getRendaAnualBruta() {
        return rendaAnualBruta;
    }

    public void setRendaAnualBruta(double rendaAnualBruta) {
        this.rendaAnualBruta = rendaAnualBruta;
    }

    public double getContribuicaoINSS() {
        return contribuicaoINSS;
    }

    public void setContribuicaoINSS(double contribuicaoINSS) {
        this.contribuicaoINSS = contribuicaoINSS;
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

    public double getDespesasEstudantis() {
        return despesasEstudantis;
    }

    public void setDespesasEstudantis(double despesasEstudantis) {
        this.despesasEstudantis = despesasEstudantis;
    }

    public double getPensaoAlimenticiaAnual() {
        return pensaoAlimenticiaAnual;
    }

    public void setPensaoAlimenticiaAnual(double pensaoAlimenticiaAnual) {
        this.pensaoAlimenticiaAnual = pensaoAlimenticiaAnual;
    }

    public ImpostoRenda(double rendaAnualBruta, double contribuicaoINSS, int dependentes, double despesasMedicas, double previdenciaPrivada, double despesasEstudantis, double pensaoAlimenticiaAnual) {
        this.rendaAnualBruta = rendaAnualBruta;
        this.contribuicaoINSS = contribuicaoINSS;
        this.dependentes = dependentes;
        this.despesasMedicas = despesasMedicas;
        this.previdenciaPrivada = previdenciaPrivada;
        this.despesasEstudantis = despesasEstudantis;
        this.pensaoAlimenticiaAnual = pensaoAlimenticiaAnual;
    }

    public double calcularImpostoAnual() {
        if (this.rendaAnualBruta <= 0) {
            return 0.0;
        }

        double deducaoPrevidencia = Math.min(this.previdenciaPrivada, this.rendaAnualBruta * 0.12);
        double deducaoMedica = this.despesasMedicas;
        double deducaoDependentes = this.dependentes * 2275.08;

        double baseCalculo = this.rendaAnualBruta - this.contribuicaoINSS - this.pensaoAlimenticiaAnual -
                deducaoDependentes - deducaoMedica - deducaoPrevidencia;

        if (baseCalculo <= 26963.20) {
            return 0.0;
        }

        double imposto;

        if (baseCalculo <= 33919.80) {
            imposto = baseCalculo * 0.075 - 2022.24;
            return imposto;
        } else if (baseCalculo <= 45012.60) {
            imposto = baseCalculo * 0.15 - 4566.23;
            return imposto;
        } else if (baseCalculo <= 55976.16) {
            imposto = baseCalculo * 0.225 - 7942.17;
            return imposto;
        }

        imposto = baseCalculo * 0.275 - 10740.98;
        return imposto;
    }
}
