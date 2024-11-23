package entidades;

public abstract class Pagamento {
        private double faturamentoTotal = 0.0;
        public abstract Double realizarPagamento(double valor);
    
        public double getFaturamentoTotal() {
            return faturamentoTotal;
        }
    
        public void setFaturamentoTotal(double faturamentoTotal) {
            this.faturamentoTotal = faturamentoTotal;
        }
    
        public double faturamento() {
            return faturamentoTotal;
        }
    }
    
