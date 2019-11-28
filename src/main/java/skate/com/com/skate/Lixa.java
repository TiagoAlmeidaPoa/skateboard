package skate.com.com.skate;

public enum Lixa {

	COLORIDA("Colorida"), 
	TRANSPARENTE("Transparente"), 
	PRETA("Preta");

	private String tipo;

	Lixa(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

}
