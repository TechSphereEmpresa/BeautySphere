package entidades;

public class Cartao extends Pagamento {

        @Override
        public Double realizarPagamento(double valor) {
            double valorComTaxa = valor * 1.02;
            setFaturamentoTotal(getFaturamentoTotal() + valorComTaxa);
           return valorComTaxa;
        
        }

        public String ToString(Double valorComTaxa){
            return "Pagamento com cartão realizado no valor de: R$" + valorComTaxa;
        }
    }
