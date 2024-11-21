package entidades;

import entidades.Enumeradas.Cortes;

public class Corte extends ServicoAbstrata {
	
	private Cortes corte;

	public Corte(char curvatura, char comprimento, Cortes corte) {
		super(curvatura, comprimento);
		this.corte = corte;
	}
	
	public Cortes getCorte() {
		return corte;
	}

	public void setCorte(Cortes corte) {
		this.corte = corte;
	}
	
	@Override
	public Double valor() {
		if (corte == Cortes.BOB) {
			return 20.0;
		} else {
			return 50.0;
		}
	}
}
