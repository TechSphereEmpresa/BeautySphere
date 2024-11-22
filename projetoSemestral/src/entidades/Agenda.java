package entidades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Cliente> clientes;
    private List<String> horariosDisponiveis;

    public Agenda() {
        this.clientes = new ArrayList<>();
        this.horariosDisponiveis = new ArrayList<>();
    }
}
