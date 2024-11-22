package entidades;

public class Caixa {
    private double faturamentoTotal = 0.0;

    public void processarPagamento(Pagamento pagamento, double valor) {
        pagamento.realizarPagamento(valor); 
    }

    public void acumularFaturamento(double valor) {
        this.faturamentoTotal += valor; 
    }

    public double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void mostrarFaturamentoClientes() {
    }

    public void exibirFaturamentoTotal() {
        System.out.println("Faturamento total: R$" + this.faturamentoTotal); 
    }
}

