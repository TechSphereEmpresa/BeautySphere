package entidades;

public class Dinheiro extends Pagamento {

        @Override
        public Double realizarPagamento(double valor) {
            setFaturamentoTotal(getFaturamentoTotal() + valor);
          /*   System.out.println("Pagamento em dinheiro realizado no valor de: R$" + valor);  */

        }


    }

