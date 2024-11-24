package entidades;

import entidades.Enumeradas.Cortes;

public class Corte extends ServicoAbstrata {
	
	private Cortes corte;

	public Corte(String curvatura, String comprimento, Cortes corte) {
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
			return 50.0;
		} else if (corte == Cortes.CHANEL){
			return 60.0;
		} else if (corte == Cortes.MULLET) {
			return 45.0;
		} else if (corte == Cortes.RASPAR){
			return 35.0;
		}
		return null; 
	}
	
	public String toString() {
		return "corte " + corte + ", cabelo " + getCurvatura() + " " + getComprimento();
	}	
}
