package skate.com.com.skate.loja;

import skate.com.com.skate.skate.Skate;

public abstract class Loja {
	
public Skate pedirSkate(String modelo) {
		
		Skate skate = criarSkate(modelo);
		
		skate.preparar();
		skate.montar();
		skate.ajustar();
		skate.embalar();	
		
		return skate;
		
	}

	protected abstract Skate criarSkate(String modelo);

}
