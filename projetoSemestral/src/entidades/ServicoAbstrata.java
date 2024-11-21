package entidades;

public abstract class ServicoAbstrata implements Servico {
	private char curvatura;
	private char comprimento;
	
	public ServicoAbstrata(char curvatura, char comprimento) {
		super();
		this.curvatura = curvatura;
		this.comprimento = comprimento;
	}

	public char getCurvatura() {
		return curvatura;
	}

	public void setCurvatura(char curvatura) {
		this.curvatura = curvatura;
	}

	public char getComprimento() {
		return comprimento;
	}

	public void setComprimento(char comprimento) {
		this.comprimento = comprimento;
	}	
}
