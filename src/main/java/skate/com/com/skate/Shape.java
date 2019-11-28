package skate.com.com.skate;

public enum Shape {

	MAPLE("Maple"), 
	MARFIM("Marfim"), 
	BAMBU("Bambu");

	private String tipo;

	Shape(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

}
