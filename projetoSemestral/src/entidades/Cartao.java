package entidades;

public class Cartao extends Pagamento {

        @Override
        public Double realizarPagamento(double valor) {
            double valorComTaxa = valor * 1.02
            ;
            setFaturamentoTotal(getFaturamentoTotal() + valorComTaxa);
           return valorComTaxa;
            /*  System.out.println("Pagamento com cartão realizado no valor de: R$" + valorComTaxa);*/
        }

        public String ToString(Double valorComTaxa){
            return "Pagamento com cartão realizado no valor de: R$" + valorComTaxa;
        }
    }
