package skate.com.com.skate.skate;

public class SkateCentro extends Skate{

	@Override
	public void preparar() {
		System.out.println("preparando shape tamanho 7.8");
		System.out.println("Adicionando Lixa fina");
		System.out.println("adicionando truck 1.39 ");
		System.out.println("Adicionando rolamento nacional");
		System.out.println("Adicionando rodas tamanho 51mm");		
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
