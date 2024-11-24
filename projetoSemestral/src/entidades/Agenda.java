package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.Enumeradas.Horas;

public class Agenda {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Horas> horariosDisponiveis = new ArrayList<>();
    
    public Agenda(List<Cliente> listaClientes, List<Horas> horariosDisponiveis) {
		super();
		this.listaClientes = listaClientes;
		this.horariosDisponiveis = horariosDisponiveis;
		
		for (Horas h : Horas.values()) {
	        horariosDisponiveis.add(h);
	    }
	}
    
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Horas> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}

	public void setHorariosDisponiveis(List<Horas> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}
	
	// Metodos
	public void addCliente (Cliente cliente) {
    	listaClientes.add(cliente);
    }

	public void removeCliente (Cliente c) {
    	listaClientes.remove(c);
    }

	public void exibirHorarios() {
		for (Horas h : horariosDisponiveis) {
			System.out.println("• " + h);
		}
	}
    
	public void marcarHorario(String horarioEscolhido) {
		Horas hEscolhido = Horas.valueOf(horarioEscolhido);
		horariosDisponiveis.remove(hEscolhido); // Remove o horário da lista de disponíveis
	}
	
    public void exibirAgenda() {
		listaClientes.sort((c1, c2) -> Horas.valueOf(c1.getHorarioEscolhido()).compareTo(Horas.valueOf(c2.getHorarioEscolhido())));

		for (Cliente c : listaClientes) { 
			System.out.println(c); 
		}
	}
}
