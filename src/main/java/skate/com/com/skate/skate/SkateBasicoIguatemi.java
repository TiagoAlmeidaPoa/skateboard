package skate.com.com.skate.skate;

public class SkateBasicoIguatemi extends Skate {

	@Override
	public void preparar() {
		System.out.println("preparando shape dropdead marfim");
		System.out.println("Adicionando Lixa hood ");
		System.out.println("adicionando truck liga ");
		System.out.println("Adicionando rolamento abec1");
		System.out.println("Adicionando rodas child");
	}

	@Override
	public void montar() {
		System.out.println("montando skate");
	}

	@Override
	public void ajustar() {
		System.out.println("ajustando skate e verificando se esta tudo OK");
	}

	@Override
	public void embalar() {
		System.out.println("embalando skate com chaveiro cortesia");
	}

	@Override
	public String getName() {
		return "Skate da Loja do Iguatemi";
	}

}
