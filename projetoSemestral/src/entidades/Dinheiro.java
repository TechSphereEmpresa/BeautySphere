package entidades;

public class Dinheiro extends Pagamento {

  @Override
  public Double realizarPagamento(double valor) {
      double valorSemTaxa = valor;
      setFaturamentoTotal(getFaturamentoTotal() + valorSemTaxa);
     return valorSemTaxa;
  
  }

  public String ToString(Double valorSemTaxa){
      return "Pagamento com dinheiro realizado no valor de: R$" + valorSemTaxa;
  }
}

