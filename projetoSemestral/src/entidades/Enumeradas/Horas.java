package entidades.Enumeradas;

public enum Horas {
	H10, H11, H13, H14, H15, H16, H17;
	
	@Override
    public String toString() {
        switch (this) {
            case H10:
                return "10:00 (H10)";
            case H11:
                return "11:00 (H11)";
            case H13:
            	return "13:00 (H13)";
            case H14:
            	return "14:00 (H14)";
            case H15:
            	return "15:00 (H15)";
            case H16:
            	return "16:00 (H16)";
            case H17:
            	return "17:00 (H17)";
            default:
                return super.toString();
        }
    }
}
