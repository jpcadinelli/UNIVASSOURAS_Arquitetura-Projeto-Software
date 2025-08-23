package exercicioTesteUnitario;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;

public class Pessoa {

    private float peso;
    private float altura;
    private String sexo;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        String sexoMinusculo = sexo.toLowerCase();

        if (!sexoMinusculo.equals("masculino") && !sexoMinusculo.equals("feminino")) {
            throw new IllegalArgumentException("erro: sexo deve ser masculino ou feminino");
        }

        this.sexo = sexoMinusculo;
    }

    public String calcularImc() {
        float imc = this.peso / (this.altura * this.altura);

        if (this.sexo.equals("masculino")) {
            if (imc < 20.7) {
                return "abaixo do peso";
            } else if (imc < 26.4) {
                return "no peso normal";
            } else if (imc < 27.8) {
                return "marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "acima do peso ideal";
            }
            return "obeso";
        }

        if (imc < 19.1) {
            return "abaixo do peso";
        } else if (imc < 25.8) {
            return "no peso normal";
        } else if (imc < 27.3) {
            return "marginalmente acima do peso";
        } else if (imc < 32.2) {
            return "acima do peso ideal";
        }
        return "obeso";
    }

}
