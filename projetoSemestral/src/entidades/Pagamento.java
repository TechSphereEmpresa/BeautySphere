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
		
    }