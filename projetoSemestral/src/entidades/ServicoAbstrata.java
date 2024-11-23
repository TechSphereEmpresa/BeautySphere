package entidades;

public abstract class ServicoAbstrata implements Servico {
	private String curvatura;
	private String comprimento;
	
	public ServicoAbstrata(String curvatura, String comprimento) {
		super();
		this.curvatura = curvatura;
		this.comprimento = comprimento;
	}

	public String getCurvatura() {
		return curvatura;
	}

	public void setCurvatura(String curvatura) {
		this.curvatura = curvatura;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	
}
