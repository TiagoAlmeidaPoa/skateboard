package skate.com.com.skate;

import skate.com.com.skate.loja.Loja;
import skate.com.com.skate.loja.LojaDoCentro;
import skate.com.com.skate.loja.LojaDoIguatemi;
import skate.com.com.skate.skate.Skate;
import skate.com.com.skate.skate.SkatePersonalizado;

public class App {
	public static void main(String[] args) {
		
		Loja lojaCentro = new LojaDoCentro();
		Loja lojaIguatemi = new LojaDoIguatemi();
		
		
		Skate skateBasicoCentro = lojaCentro.pedirSkate("basico");
		System.out.println("prontinho pra andar um " + skateBasicoCentro.getName());
		
		System.out.println();
		
		Skate skateBasicoIguatemi = lojaIguatemi.pedirSkate("basico");
		System.out.println("prontinho pro rolê " + skateBasicoIguatemi.getName());
		
		System.out.println();
		
		try {

            Skate skate = SkatePersonalizado.builder()
            				.comModelo(Modelo.BASICO)
							.comLixa(Lixa.TRANSPARENTE)
							.comShape(Shape.MAPLE)
            				.build();

            skate.preparar();
            skate.montar();
            skate.ajustar();
            skate.embalar();
            

    	} catch(Exception e) {
    		System.out.println("Opção inválida: " + e.getMessage());
    	}
	}
}
