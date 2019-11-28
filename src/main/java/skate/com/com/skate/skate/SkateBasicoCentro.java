package skate.com.com.skate.skate;

public class SkateBasicoCentro extends Skate {

	@Override
	public void preparar() {
		System.out.println("preparando shape cisco bambu");
		System.out.println("Adicionando Lixa da loja");
		System.out.println("adicionando truck crail ");
		System.out.println("Adicionando rolamento black-sheep");
		System.out.println("Adicionando rodas hagil");
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
		System.out.println("embalando skate com adesivos de cortesia");
	}

	@Override
	public String getName() {
		return "Skate da Loja do Centro";
	}

}
