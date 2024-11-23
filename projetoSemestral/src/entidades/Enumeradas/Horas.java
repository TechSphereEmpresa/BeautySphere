package entidades.Enumeradas;

public enum Horas {
	H10("10:00"), 
	H11("11:00"), 
	H13("13:00"),
	H14("14:00"),
	H15("13:00"),
	H16("16:00"),
	H17("17:00");

	private final String hora;

	// Associar o valor
	Horas(String hora) {
	        this.hora = hora;
	    }

	// Obter o valor associado
	public String getHora() {
		return hora;
	}
}
