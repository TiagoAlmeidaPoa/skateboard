package skate.com.com.skate.skate;

import skate.com.com.skate.Lixa;
import skate.com.com.skate.Modelo;
import skate.com.com.skate.Shape;

public class SkatePersonalizado extends Skate{
	
	private Lixa lixa;
	private Modelo modelo;
	private Shape shape;
	
	private SkatePersonalizado() {}
	
	public static Builder builder() {
		return new SkatePersonalizado().new Builder();
	}
	
	public class Builder{
		
		private SkatePersonalizado skate;
		
		Builder() {
			this.skate = new SkatePersonalizado();
		}
		
		public Builder comShape(Shape shape) {
			skate.shape = shape;
			return this;
		}
		
		public Builder comModelo(Modelo	modelo) {
			skate.modelo = modelo;
			return this;
		}
		
		public Builder comLixa(Lixa lixa) {
			skate.lixa = lixa;
			return this;
		}
		
		public Skate build() throws Exception {

			if(skate.modelo == null) {
				throw new Exception("Skate inválido: Modelo não informado");				
			}
			
			if(skate.shape == null) {
				throw new Exception("Skate inválido: shape não informado");				
			}
			
			if(skate.lixa == null) {
				throw new Exception("Skate inválido: Lixa não informada");				
			}
			
			return skate;
			
		}
	}

	@Override
	public void preparar() {
		System.out.println("Preparando Skate Personalizado");
		System.out.println("Modelo: " + modelo.name());
		System.out.println("Shape: " + shape.name());
		System.out.println("Lixa: " + lixa.name());
	}

	@Override
	public void montar() {
		System.out.println("montando skate Personalizado");
	}

	@Override
	public void ajustar() {
		System.out.println("ajustando skate e verificando se esta tudo OK");
	}

	@Override
	public void embalar() {
		System.out.println("embalando skate Personalizado");
	}

	@Override
	public String getName() {
		return "Skate Personalizado";
	}

}
