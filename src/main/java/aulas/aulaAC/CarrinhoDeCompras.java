package aulas.aulaAC;

public class CarrinhoDeCompras {

    private int quantidadeProdutos;
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public CarrinhoDeCompras(int quantidadeProdutos, double valorTotal) {
        this.quantidadeProdutos = quantidadeProdutos;
        this.valorTotal = valorTotal;
    }

    public double CalculaDesconto() {
        if (this.quantidadeProdutos == 1) {
            return this.getValorTotal() * 0.1;
        } else if (this.quantidadeProdutos == 2) {
            return this.getValorTotal() * 0.19;
        } else if (this.quantidadeProdutos == 3) {
            return this.getValorTotal() * 0.27;
        } else if (this.quantidadeProdutos == 4) {
            return this.getValorTotal() * 0.34;
        } else if (this.quantidadeProdutos == 5) {
            return this.getValorTotal() * 0.4;
        } else if (this.quantidadeProdutos == 6) {
            return this.getValorTotal() * 0.45;
        } else if (this.quantidadeProdutos == 7) {
            return this.getValorTotal() * 0.49;
        } else if (this.quantidadeProdutos == 8) {
            return this.getValorTotal() * 0.52;
        } else if (this.quantidadeProdutos == 9) {
            return this.getValorTotal() * 0.54;
        } else if (this.quantidadeProdutos == 10) {
            return this.getValorTotal() * 0.55;
        } else if (this.quantidadeProdutos >= 11) {
            return this.getValorTotal() * 0.6;
        }
        return 0.0;
    }
}
