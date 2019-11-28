package skate.com.com.skate;

public enum Modelo {

	BASICO("Basico"), 
	PRO("Pro"), 
	KIDS("Kids");

	private String tipo;

	Modelo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

}
