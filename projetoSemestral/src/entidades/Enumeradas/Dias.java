package entidades.Enumeradas;

public enum Dias {
	TER, QUA, QUI, SEX, SAB;
	
	@Override
    public String toString() {
        switch (this) {
            case TER:
                return "Terça (Ter)";
            case QUA:
                return "Quarta (Qua)";
            case QUI:
            	return "Quinta (Qui)";
            case SEX:
            	return "Sexta (Sex)";
            case SAB:
            	return "Sábado (Sab)";
            default:
                return super.toString();
        }
	}
}
