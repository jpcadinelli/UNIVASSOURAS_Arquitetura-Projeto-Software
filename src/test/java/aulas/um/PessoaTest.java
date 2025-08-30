package aulas.um;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    Pessoa pessoa;
    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveSetarPessoaComoMasculino() {
        pessoa.setSexo("masculino");
        assertEquals("masculino", pessoa.getSexo());
    }

    @Test
    void deveSetarPessoaComoFeminino() {
        pessoa.setSexo("feminino");
        assertEquals("feminino", pessoa.getSexo());
    }

    @Test
    void deveLancarExcecaoPessoaComoOutroSexo() {
        try {
            pessoa.setSexo("outro");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("erro: sexo deve ser masculino ou feminino", e.getMessage());
        }
    }

    @Test
    void deveCalcularImcHomemAbaixoDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        pessoa.setSexo("masculino");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcHomemPesoNormal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.0f);
        pessoa.setSexo("masculino");
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcHomemMarginalmenteAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        pessoa.setSexo("masculino");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcHomemAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        pessoa.setSexo("masculino");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcHomemObeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.1f);
        pessoa.setSexo("masculino");
        assertEquals("obeso", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcMulherAbaixoDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        pessoa.setSexo("feminino");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcMulherPesoNormal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        pessoa.setSexo("feminino");
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcMulherMarginalmenteAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        pessoa.setSexo("feminino");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcMulherAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.1f);
        pessoa.setSexo("feminino");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveCalcularImcMulherObeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        pessoa.setSexo("feminino");
        assertEquals("obeso", pessoa.calcularImc());
    }

}
