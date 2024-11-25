package entidades;

public class PagamentoBoleto extends Pagamento {
	private Double taxa;
	private Integer nParcelas;
	
	public PagamentoBoleto(Double valor, Double taxa, Integer nParcelas) {
		super(valor);
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

}