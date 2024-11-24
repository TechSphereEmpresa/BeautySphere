package entidades;

public class PagamentoBoleto extends Pagamento {
	private Double taxa;
	private Integer nParcelas;
	
	public PagamentoBoleto(Double valorServico, Double taxa, Integer nParcelas) {
		super(valorServico);
		this.taxa = taxa;
		this.nParcelas = nParcelas;
	}
	
	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Integer getnParcelas() {
		return nParcelas;
	}

	public void setnParcelas(Integer nParcelas) {
		this.nParcelas = nParcelas;
	}

	public Double Parcelar() {
		return ((getValor() * taxa) / nParcelas);
	}

	@Override
	public Double realizarPagamento() {
		return Parcelar();
	}

	/*public String toString() {
		return "Pagamento com cartão realizado no valor de: R$" + valorComTaxa;
	}*/
}