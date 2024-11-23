package entidades;

import entidades.Enumeradas.Penteados;

public class Penteado extends ServicoAbstrata {
	
	private Penteados penteado;

	public Penteado(String curvatura, String comprimento, Penteados penteado) {
		super(curvatura, comprimento);
		this.penteado = penteado;
	}

	public Penteados getPenteado() {
		return penteado;
	}

	public void setPenteado(Penteados penteado) {
		this.penteado = penteado;
	}
	
	@Override
	public Double valor() {
		if (penteado == Penteados.COQUE) {
			return 15.0;
		} else {
			return 30.0;
		}
	}
}
