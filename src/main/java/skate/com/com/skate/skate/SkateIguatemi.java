package skate.com.com.skate.skate;

public class SkateIguatemi extends Skate{

	@Override
	public void preparar() {
		System.out.println("preparando shape tamanho 8.0");
		System.out.println("Adicionando Lixa grossa");
		System.out.println("adicionando truck 1.49 ");
		System.out.println("Adicionando rolamento importado");
		System.out.println("Adicionando rodas tamanho 55mm");		
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
		System.out.println("embalando skate com chaveio cortesia");
	}

	@Override
	public String getName() {
		return "Skate da Loja do Iguatemi";
	}

}
