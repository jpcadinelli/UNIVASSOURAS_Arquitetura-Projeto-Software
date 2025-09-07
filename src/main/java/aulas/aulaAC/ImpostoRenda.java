package aulas.aulaAC;

import java.util.List;

public class ImpostoRenda {

    private double rendaAnualBruta;
    private double contribuicaoINSS;
    private double despesasMedicas;
    private double previdenciaPrivada;
    private double despesasEstudantis;
    private double pensaoAlimenticiaAnual;
    private double despesasEducacaoTitular;
    private List<Dependente> dependentes;

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

    public double getDespesasEducacaoTitular() {
        return despesasEducacaoTitular;
    }

    public void setDespesasEducacaoTitular(double despesasEducacaoTitular) {
        this.despesasEducacaoTitular = despesasEducacaoTitular;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public ImpostoRenda(double rendaAnualBruta, double contribuicaoINSS, double despesasMedicas,
                        double previdenciaPrivada, double despesasEstudantis, double pensaoAlimenticiaAnual,
                        double despesasEducacaoTitular, List<Dependente> dependentes) {
        this.rendaAnualBruta = rendaAnualBruta;
        this.contribuicaoINSS = contribuicaoINSS;
        this.despesasMedicas = despesasMedicas;
        this.previdenciaPrivada = previdenciaPrivada;
        this.despesasEstudantis = despesasEstudantis;
        this.pensaoAlimenticiaAnual = pensaoAlimenticiaAnual;
        this.despesasEducacaoTitular = despesasEducacaoTitular;
        this.dependentes = dependentes;
    }

    public double calcularImpostoAnual() {
        if (this.rendaAnualBruta <= 0) {
            return 0.0;
        }

        double deducaoPrevidencia;
        if (this.previdenciaPrivada > this.rendaAnualBruta * 0.12) {
            deducaoPrevidencia = this.rendaAnualBruta * 0.12;
        } else {
            deducaoPrevidencia = this.previdenciaPrivada;
        }

        double deducaoDependentes = this.dependentes.size() * 2275.08;

        double limitePorPessoa = 3561.50;
        double despesasEducacaoTotal = 0.0;
        if (despesasEducacaoTitular > limitePorPessoa) {
            despesasEducacaoTotal += limitePorPessoa;
        } else {
            despesasEducacaoTotal += despesasEducacaoTitular;
        }

        for (Dependente dep : dependentes) {
            if (dep.getGastoEducacaoAnual() > limitePorPessoa) {
                despesasEducacaoTotal += limitePorPessoa;
                continue;
            }
            despesasEducacaoTotal += dep.getGastoEducacaoAnual();
        }

        double baseCalculo = this.rendaAnualBruta - this.contribuicaoINSS - this.pensaoAlimenticiaAnual -
                deducaoDependentes - this.despesasMedicas - deducaoPrevidencia - despesasEducacaoTotal;

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
