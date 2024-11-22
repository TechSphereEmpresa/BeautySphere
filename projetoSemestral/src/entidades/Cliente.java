package entidades;

import java.util.List;

public class Cliente {
	private String nome;
	private String horarioEscolhido;
	private List<ServicoAbstrata> listaServicos;

	public Cliente(String nome, String horarioEscolhido, List<ServicoAbstrata> listaServicos) {
		super();
		this.nome = nome;
		this.horarioEscolhido = horarioEscolhido;
		this.listaServicos = listaServicos;
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
	
	public List<ServicoAbstrata> getListaServicos() {
		return listaServicos;
	}
	
	public void setListaServicos(List<ServicoAbstrata> listaServicos) {
		this.listaServicos = listaServicos;
	}

	@Override
    public String toString() {
        return horarioEscolhido + " - " + nome + ", " + listaServicos;
    }
}
