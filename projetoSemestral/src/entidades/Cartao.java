package entidades;

public class Cartao extends Pagamento {

        @Override
        public void realizarPagamento(double valor) {
            double valorComTaxa = valor * 1.02
            ;
            setFaturamentoTotal(getFaturamentoTotal() + valorComTaxa);
           /*  System.out.println("Pagamento com cartão realizado no valor de: R$" + valorComTaxa);*/
        }
    }
