package entidades;

public class Dinheiro extends Pagamento {

        @Override
        public void realizarPagamento(double valor) {
            setFaturamentoTotal(getFaturamentoTotal() + valor);
          /*   System.out.println("Pagamento em dinheiro realizado no valor de: R$" + valor);  */
        }
    }

