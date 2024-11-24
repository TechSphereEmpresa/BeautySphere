package entidades;

public class Pagamento {
        private Double valor;
        
        public Pagamento(Double valor) {
			super();
			this.valor = valor;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}
		
		public Double realizarPagamento() {
			return valor;
		}
		
		/*public void setFaturamentoTotal(Double faturamentoTotal) {
			this.faturamentoTotal = faturamentoTotal;
		}

		public double getFaturamentoTotal() {
            return faturamentoTotal;
        }
    
        public void setFaturamentoTotal(double faturamentoTotal) {
            this.faturamentoTotal = faturamentoTotal;
        }
    
        public double faturamento() {
            return faturamentoTotal;
        }*/
		
		
    }