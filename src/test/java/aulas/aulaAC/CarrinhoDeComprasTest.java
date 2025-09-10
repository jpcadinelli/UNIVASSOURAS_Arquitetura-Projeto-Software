package aulas.aulaAC;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarrinhoDeComprasTest {

    @Test
    void deveCalcularDesconto10Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(1, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(10.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto19Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(2, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(19.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto27Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(3, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(27.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto34Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(4, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(34.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto40Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(5, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(40.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto45Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(6, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(45.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto49Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(7, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(49.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto52Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(8, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(52.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto54Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(9, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(54.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto55Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(10, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(55.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto60Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(11, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(60.0, Double.valueOf(formato.format(desconto)));
    }

    @Test
    void deveCalcularDesconto0Porcento() {
        DecimalFormat formato = new DecimalFormat("#.#");
        CarrinhoDeCompras carrinhoDeCompras;
        carrinhoDeCompras = new CarrinhoDeCompras(0, 100);
        double desconto = carrinhoDeCompras.CalculaDesconto();
        assertEquals(0.0, Double.valueOf(formato.format(desconto)));
    }

}
