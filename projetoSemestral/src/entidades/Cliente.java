package entidades;

import java.util.List;

import entidades.Enumeradas.Horas;

public class Cliente {
	private String nome;
	private String horarioEscolhido;
	private Servico servico;
	private Pagamento pagamento;

	public Cliente(String nome, String horarioEscolhido, Servico servico, Pagamento pagamento) {
		super();
		this.nome = nome;
		this.horarioEscolhido = horarioEscolhido;
		this.servico = servico;
		this.pagamento = pagamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHorarioEscolhido() {
		return horarioEscolhido;
	}
	
	public void setHorarioEscolhido(String horarioEscolhido) {
		this.horarioEscolhido = horarioEscolhido;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	@Override
    public String toString() {
		return Horas.valueOf(horarioEscolhido) + ": " + nome + ", " + servico + ". Valor R%" + pagamento.realizarPagamento();
    }
}