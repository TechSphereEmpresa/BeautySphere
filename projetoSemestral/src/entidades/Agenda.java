package entidades;

import entidades.Enumeradas.Dias;
import entidades.Enumeradas.Horas;

public class Agenda {
	private Cliente[][] horario = new Cliente[Horas.values().length][Dias.values().length];

	public void setCliente(Horas hora, Dias dia, Cliente cliente) {
        horario[hora.ordinal()][dia.ordinal()] = cliente;
    }
	
	public Cliente getCliente(Horas hora, Dias dia) {
        return horario[hora.ordinal()][dia.ordinal()];
    }
}
