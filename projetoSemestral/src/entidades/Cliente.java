package entidades;

public class Cliente {
	private String nome;
	private String servico;
	private Integer horario;

	public Cliente(String nome, String servico) {
		super();
		this.nome = nome;
		this.servico = servico;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}
	
	
}
